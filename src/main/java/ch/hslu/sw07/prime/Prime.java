/*
 * Copyright (c) 2022.
 * Flavio Waser
 * Version 1.0
 */

package ch.hslu.sw07.prime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigInteger;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class Prime implements Callable<BigInteger> {
    /**
     * Create Log4J Logger
     */
    private static final Logger Log = LogManager.getLogger(Prime.class);

    private static final int NUM_BITS = 1024;
    private Queue<BigInteger> resultQueue;

    public Prime(Queue<BigInteger> resultQueue){
        this.resultQueue = resultQueue;
    }

    public Prime(){
        this.resultQueue = null;
    }

    public static BigInteger findPrime(){
        boolean foundPrime = false;
        BigInteger number;
        do {
            number = new BigInteger(NUM_BITS, new Random());
            foundPrime = number.isProbablePrime(Integer.MAX_VALUE);
        } while (!foundPrime);
        return number;
    }

    @Override
    public BigInteger call() throws Exception {
        boolean foundPrime = false;
        BigInteger number;
        do {
            number = new BigInteger(NUM_BITS, new Random());
            foundPrime = number.isProbablePrime(Integer.MAX_VALUE);
        } while (!foundPrime);

        if(resultQueue != null){
            resultQueue.offer(number);
        }
        return number;
    }



}
