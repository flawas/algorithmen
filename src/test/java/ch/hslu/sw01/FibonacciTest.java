/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ch.hslu.sw01;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author flaviowaser
 */
public class FibonacciTest {
    
    public FibonacciTest() {
         
    }

    @Test
    public void testFibonacciTestRec1() {
        Assertions.assertEquals(8, Fibonacci.ficoRec1(7));
    }
    
    @Test
    public void testFibonacciTestRec2(){
        Assertions.assertEquals(8, Fibonacci.ficoRec1(7));
    }
    
}
