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
public class ggtRekursiv {

    private static final Logger LOGGER = LogManager.getLogger(ggtRekursiv.class);
    
    public static int ggtRekursiv(final int a, final int b) {
        if (a > b) {
            return ggtRekursiv(a - b, b);
        } else {
            if (a < b) {
                return ggtRekursiv(a, b - a);
            } else {
                return a;
            }
        }
    }
     /**
     * Main-Methode.
     * @param args Startargumente.
     */
    public static void main(final String[] args) {
        LOGGER.info(ggtRekursiv(16, 68));
        
    } 
}
