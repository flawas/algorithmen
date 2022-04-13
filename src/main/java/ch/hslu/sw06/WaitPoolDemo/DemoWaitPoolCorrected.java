/*
 * Copyright (c) 2022.
 * Flavio Waser
 * Version 1.0
 */

package ch.hslu.sw06.WaitPoolDemo;

public class DemoWaitPoolCorrected {
    private static final Object LOCK = new Object();

    public static void main(String[] args) throws InterruptedException {
        MyTask waiter = new MyTask(LOCK);
        new Thread(waiter).start();
        Thread.sleep(1000);

        synchronized (LOCK) {
            LOCK.notify();
        }
    }
}
