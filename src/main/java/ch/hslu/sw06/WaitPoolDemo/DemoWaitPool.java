/*
 * Copyright (c) 2022.
 * Flavio Waser
 * Version 1.0
 */

package ch.hslu.sw06.WaitPoolDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Demonstration eines Wait-Pools.
 */
public final class DemoWaitPool {
    private static final Object LOCK = new Object();

    public static void main(final String args[]) throws InterruptedException {
        final MyTask waiter = new MyTask(LOCK);
        new Thread(waiter).start();
        Thread.sleep(1000);
        LOCK.notify();
    }
}
