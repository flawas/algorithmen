/*
 * Copyright (c) 2022.
 * Flavio Waser
 * Version 1.0
 */

package ch.hslu.sw06.WaitPoolDemo;

import ch.hslu.sw04.buckets.App;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Einfacher Task für die Demonstration eines Wait-Pools.
 *
 */
public final class MyTask implements Runnable {
    private static final Logger LOG = LogManager.getLogger(MyTask.class);

    private final Object lock;

    public MyTask(final Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        LOG.info("warten...");
         synchronized (lock) {
            try {
                lock.wait();
            }
            catch (InterruptedException ex) {
                LOG.error(ex.getMessage());
                return;
            }
        }
        LOG.info("...aufgewacht");
    }
}