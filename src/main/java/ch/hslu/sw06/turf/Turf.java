/*
 * Copyright (c) 2022.
 * Flavio Waser
 * Version 1.0
 */

package ch.hslu.sw06.turf;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public final class Turf {
    private static final Logger LOG = LogManager.getLogger("HorseRace");

    private static final int TOTAL_SLOTS = 5; // amount of slots for the race
    private static final int CANCELLATION_AFTER_MILLIS = 1000; // after millis cancel the race
    private static final boolean INTERRUPT_RACE = false; // if the race should be interrupted

    public static void main(final String[] args) {
        //Synch starterBox = new Latch(TOTAL_SLOTS);
        List<Thread> horses = new ArrayList<>();
        List<Synch> startBoxes = new ArrayList<>();

        LOG.info("Pferde bereit machen ...");

        for (int i = 1; i <= TOTAL_SLOTS; i++) {
            Synch starterBox = new Latch(TOTAL_SLOTS);
            startBoxes.add(starterBox);
        }

        for (int i = 1; i <= TOTAL_SLOTS; i++) {
            Thread thread = new Thread(new RaceHorse(startBoxes.get(i - 1)), "Horse " + i);
            horses.add(thread);
            thread.start();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Synch starterBox : startBoxes) {
            starterBox.release();
        }

        if (INTERRUPT_RACE) { // check if the race should be interrupted
            try {
                Thread.sleep(CANCELLATION_AFTER_MILLIS);
                LOG.info("Die Rennleitung bricht das Rennen ab.");
                for (Thread thread : horses) {
                    thread.interrupt();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}