/*
 * Copyright (c) 2022.
 * Flavio Waser
 * Version 1.0
 */

package ch.hslu.sw07.prime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class App {
    private static final int N_PRIMES = 100;
    /**
     * Create Log4J Logger
     */
    private static final Logger Log = LogManager.getLogger();
    private static final boolean logging = true;

    public static void main(String[] args) {
        findPrimesAsync();
    }

    /**
     * Finde Primzahlen Asynchron
     */
    public static void findPrimesAsync(){
        try {
            long start = System.currentTimeMillis();
            List<BigInteger> primes = findPrimesAsync(N_PRIMES);
            long end = System.currentTimeMillis();

            if(logging){
                for(BigInteger prime : primes){
                    Log.debug(prime.toString().substring(0,20) + "...");
                }
            }

            Log.debug(String.format("asynchronous: found %d big prime numbers in %.2f seconds", N_PRIMES, (float) (end - start) / 1000));
        } catch (Exception ex){
            Log.error(ex.getMessage());
        }
    }

    public static List<BigInteger> findPrimesAsync(final int nPrimes) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() + 1);
        CompletionService<BigInteger> completionService = new ExecutorCompletionService<>(executorService);
        List<BigInteger> primes = new ArrayList<>(nPrimes);

        for(int n = 0; n < nPrimes; n++){
            completionService.submit(new Prime());
        }

        for(int n = 0; n < nPrimes; n++) {
            try{
                primes.add(completionService.take().get());
            } catch (InterruptedException | ExecutionException e){
                throw new Exception(e);
            }
        }

        executorService.shutdown();
        return primes;
    }


}
