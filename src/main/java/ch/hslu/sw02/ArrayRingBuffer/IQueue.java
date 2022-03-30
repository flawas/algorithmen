/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch.hslu.sw02.ArrayRingBuffer;

/**
 *
 * @author Flavio Waser
 */
public interface IQueue<T> {
    
    boolean offer(T element);
    
    T poll();
    
    T peek();
    
    boolean isFull();
    
    boolean isEmpty();
    
}
