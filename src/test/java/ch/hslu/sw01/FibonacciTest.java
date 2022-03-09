/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ch.hslu.sw01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author flaviowaser
 */
public class FibonacciTest {
    
    public FibonacciTest() {
    }
    
    @Test
    public void testFibonacciTestRec1() {
        Assertions.assertEquals(1, Fibonacci.ficoRec1(1));
    }
    
    @Test
    public void testFibonacciTestRec2(){
        Assertions.assertEquals(13, Fibonacci.ficoRec1(7));
    }
    
}
