/*
 * Copyright 2022 Hochschule Luzern - Informatik.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.hslu.sw06.buffer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayDeque;
import java.util.concurrent.Semaphore;

/**
 * Puffer nach dem First In First Out Prinzip mit einer begrenzten Kapazität.
 * Der Puffer ist thread sicher.
 *
 * @param <T> Elememente des Buffers
 */
public final class BoundedBuffer<T> implements Buffer<T> {
    /**
     * Create Log4J Logger
     */
    private static final Logger LOGGER = LogManager.getLogger(DemoBoundedBuffer.class);

    private final ArrayDeque<T> queue;
    private final Semaphore putSema;
    private final Semaphore takeSema;

    /**
     * Erzeugt einen Puffer mit bestimmter Kapazität.
     *
     * @param n Kapazität des Puffers
     */
    public BoundedBuffer(final int n) {
        queue = new ArrayDeque<>(n);
        putSema = new Semaphore(n);
        takeSema = new Semaphore(0);
    }

    @Override
    public void put(final T elem) throws InterruptedException {
        try {
            putSema.acquire();
        } catch (InterruptedException e){
            LOGGER.debug("Fehler: " + e);
        }
        synchronized (queue) {
            queue.addFirst(elem);
        }
        takeSema.release();
    }

    @Override
    public T get() throws InterruptedException {
        takeSema.acquire();
        T elem;
        synchronized (queue) {
            elem = queue.removeLast();
        }
        takeSema.release();
        return elem;
    }

    @Override
    public boolean put(T elem, long millis) throws InterruptedException {
        try {
            putSema.acquire();
        } catch (InterruptedException e){
            LOGGER.debug("Fehler: " + e);
            return false;
        }
        synchronized (queue) {
            queue.addFirst(elem);
            LOGGER.info("Element: " + elem + " wurde hinzugefügt");
        }
        putSema.release();
        return true;
    }

    @Override
    public T get(long millis) throws InterruptedException {
        try {
            takeSema.acquire();
        } catch (InterruptedException e){
            LOGGER.debug("Fehler: " + e);
        }
        synchronized (queue){
            LOGGER.info("Letztes Element ausgeben und entfernen: " + queue.getLast());
            takeSema.release();
            return queue.getLast();
        }
    }

    @Override
    public T first() throws InterruptedException {
        try{
            takeSema.acquire();
        } catch (InterruptedException e){
            LOGGER.debug("Fehler: " + e);
        }
        LOGGER.info("Erstes Element ausgeben: " + queue.getFirst());
        return queue.getFirst();
    }

    @Override
    public T last() throws InterruptedException {
        try{
            takeSema.acquire();
        } catch (InterruptedException e){
            LOGGER.debug("Fehler: " + e);
        }
        LOGGER.info("Letztes Element ausgeben: " + queue.getFirst());
        return queue.getLast();
    }

    @Override
    public boolean empty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean full() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean size() {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
}
