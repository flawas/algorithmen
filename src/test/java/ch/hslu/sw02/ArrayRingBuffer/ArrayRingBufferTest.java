/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ch.hslu.sw02.ArrayRingBuffer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Flavio Waser
 */
public class ArrayRingBufferTest {

    @Test
    void offerElement() {
        ArrayRingBuffer<Character> ringBuffer = new ArrayRingBuffer<>(8);
        char element = 'j';
        ringBuffer.offer(element);
    }
    
    @Test
    void offerElementWithBufferOverflow() {
        ArrayRingBuffer<Character> ringBuffer = new  ArrayRingBuffer<>(2);
        char element = 'u';
        ringBuffer.offer('j');
        ringBuffer.offer(element);
        ringBuffer.poll();
        
        Assertions.assertTrue(ringBuffer.offer('l'));
        
        Assertions.assertTrue(ringBuffer.isFull());
        Assertions.assertEquals(element, ringBuffer.peek());
    }
    
    @Test
    void offerElementWhenQueueIsFull() {
        ArrayRingBuffer<Character> ringBuffer = new ArrayRingBuffer<>(2);
        ringBuffer.offer('j');
        ringBuffer.offer('u');
        
        Assertions.assertTrue(ringBuffer.isFull());
        Assertions.assertFalse(ringBuffer.offer('l'));
    }
    
    @Test
    void pollElement() {
        ArrayRingBuffer<Character> ringBuffer = new ArrayRingBuffer<>(8);
        char element = 'j';
        
        ringBuffer.offer(element);
        char removedElement = ringBuffer.poll();
        
        Assertions.assertTrue(ringBuffer.isEmpty());
        Assertions.assertEquals(element, removedElement);
    }
    /*
    @Test
    void throwsExceptionPollElementWhenQueueIsEmpty(){
        ArrayRingBuffer<Character> ringBuffer = new ArrayRingBuffer<>(8);
        Assertions.assertThrows(Exception, ringBuffer::poll);
    }
    */
    @Test
    void pullSeveralElements() {
        ArrayRingBuffer<Character> ringBuffer = new ArrayRingBuffer<>(8);
        char element = 'j';
        char elementTwo = 'u';
        
        ringBuffer.offer(element);
        ringBuffer.offer(elementTwo);
        
        char removedElement = ringBuffer.poll();
        char removedElementTwo = ringBuffer.poll();
        
        Assertions.assertEquals(element, removedElement);
        Assertions.assertEquals(elementTwo, removedElementTwo);
    }
    
}
