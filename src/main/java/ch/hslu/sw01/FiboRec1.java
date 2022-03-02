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
public class FiboRec1 {
    
    private static final Logger LOGGER = LogManager.getLogger(GgtIterativ1.class);

    public static int fiboRec1(int n) {
        if (n == 0) {
            LOGGER.debug("0 will be returned");
            return 0;
        } else if (n == 1) {
            LOGGER.debug("0 will be returned");
            return 1;
        } else {
            LOGGER.info("n is taller than 2");
            n = fiboRec1(n - 2) + fiboRec1(n - 1);
            LOGGER.debug("Actual n is " + n);
        } 
        LOGGER.debug("Returning value of n is " + n);
        return n;
        
    }
    
}
