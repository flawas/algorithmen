/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw01;

/**
 *
 * @author flaviowaser
 */
public class SymetrieDemo {
    
    public static boolean isSymetrical(final long input){
        String inputString = Long.toString(input);
        while (inputString.length() > 1){
            if (inputString.charAt(0) != inputString.charAt(inputString.length() - 1 )) {
                return false;
            }
            inputString = inputString.substring(1, inputString.length() - 1);
        }
        return true;
    }
    
    public static long getNextSymetricalNumber (long number) {
        while(!isSymetrical(number)) {
            number++;
        }
        return number;
    }
    
}
