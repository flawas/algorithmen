/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ch.hslu.sw02.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Flavio Waser
 */
public class ArrayStackTest {

    @Test
    public void createEmptyStack() {
        ArrayStack<String> arrayStack = new ArrayStack(1);
        Assertions.assertTrue(arrayStack.isEmpty());
    }
    
    @Test
    void size(){
        ArrayStack<String> arrayStack = new ArrayStack(1);
        Assertions.assertEquals(1, arrayStack.size());
    }
    
    @Test
    void pushElement(){
        ArrayStack<String> arrayStack = new ArrayStack(1);
        String element = "Test String";
        arrayStack.push(element);
        Assertions.assertFalse(arrayStack.isEmpty());
        Assertions.assertEquals(element, arrayStack.peek());
    }
    
    @Test
    void popElement(){
        ArrayStack<String> arrayStack = new ArrayStack(2);
        String firstElement = "First Element";
        String secondElement = "Second Element";
        arrayStack.push(firstElement);
        arrayStack.push(secondElement);
        String removedElement = arrayStack.pop();
        Assertions.assertEquals(secondElement, removedElement);
    }
    
    @Test
    void isStackFull(){
        ArrayStack<String> arrayStack = new ArrayStack<>(1);
        arrayStack.push("First Element");
        Assertions.assertTrue(arrayStack.isFull());
    }
    
}
