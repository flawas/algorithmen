/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author flaviowaser
 */
public class task {
    
    private static final Logger LOGGER = LogManager.getLogger(ggtRekursiv.class);

    public static void task (final int n) {
        task1();
        task1();
        task1();
        task1();
        for (int i = 0; i < n; i++){
            task2();
            task2();
            task2();
            for (int j = 0; j < n; j++){
                task3();
                task3();
            }
        }
        
    }

    private static void task1() {
        LOGGER.info(System.currentTimeMillis());
        LOGGER.info("Task 1");
    }

    private static void task2() {
        LOGGER.info(System.currentTimeMillis());
        LOGGER.info("Task 2");
    }

    private static void task3() {
        LOGGER.info(System.currentTimeMillis());
        LOGGER.info("Task 3");
    }
     /**
     * Main-Methode.
     * @param args Startargumente.
     */
    public static void main(final String[] args) {
        task(200);
        LOGGER.info("Ende des Programms");
        
    }     
}
