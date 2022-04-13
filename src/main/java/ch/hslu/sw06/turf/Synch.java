/*
 * Copyright (c) 2022.
 * Flavio Waser
 * Version 1.0
 */

package ch.hslu.sw06.turf;

public interface Synch {
    /**
     * Eintritt in einen geschützten Bereich erlangen,
     * falls kein Zutritt möglich ist warten.
     *
     * @throws InterruptedException wenn das Warten unterbrochen wird.
     */
    public void acquire() throws InterruptedException;

    /**
     * Freigabe des geschützten Bereiches.
     */
    public void release();
}