/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw01;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author flaviowaser
 */
public class Fibonacci {
    private static Map<Integer,Integer> fibonacciNumbers = new HashMap<Integer, Integer>();
    
    public static int ficoRec1(int n) {
        //Rekursionsbasis
        if (n == 0){
            return 0;
        } else if(n == 1) {
           return 1;
        } else {
            //Rekursivvorschrift
            return ficoRec1(n - 1) + ficoRec1(n - 2);
        }
    }
    
    public static int fiboRec2(int n){
        //Rekursionsbasis
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else if (fibonacciNumbers.get(n) != 0) {
            return fibonacciNumbers.get(n);
        } else {
            int fibonacci = fiboRec2(n - 1) + fiboRec2(n - 2);
            fibonacciNumbers.put(n, fibonacci);
            return fibonacci;
        }
    }
    
    public static int fiboIter(int n){
        if (n == 0){
            return 0;
        } 
        int first = 0;
        int second = 1;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }
}
