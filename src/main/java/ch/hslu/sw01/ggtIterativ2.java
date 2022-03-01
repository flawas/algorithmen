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
public class ggtIterativ2 {

    private static final Logger LOGGER = LogManager.getLogger(ggtIterativ2.class);
    
    public static int ggtIterativ2(int a, int b) {
        while ((a != 0) && (b != 0 )) {
            if (a > b) {
                a = a % b;
                LOGGER.info("if Schleife");
            } else {
                b = b % a;
                LOGGER.info("else Schleife");
            }
        }
        return a + b;
    }
     /**
     * Main-Methode.
     * @param args Startargumente.
     */
    public static void main(final String[] args) {
        LOGGER.info(ggtIterativ2(16, 68));
        
    } 
}
