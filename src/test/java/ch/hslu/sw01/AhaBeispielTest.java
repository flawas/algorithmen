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
public class AhaBeispielTest {
    
    public AhaBeispielTest() {
    }

    @Test
    public void testTask10() {
        Assertions.assertEquals(234, AhaBeispiel.task(10, true));
    }
    
    @Test
    public void TestTask1(){
        Assertions.assertEquals(9, AhaBeispiel.task(1, true));
    }
    
    public void TestTask() {
        float test = (float) AhaBeispiel.task(2000, false) / AhaBeispiel.task(1000, false);
        System.out.println("Differenz bei Verdoppelung des Inputs sollte etwa eine Verierfachung sein.");
        System.out.println("Differenz ist eine ver-" + test + "-fachung");
        Assertions.assertTrue(3 <= test && test <=4);
    }
            
    
}
