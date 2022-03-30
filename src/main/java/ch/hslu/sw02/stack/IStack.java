/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch.hslu.sw02.stack;

/**
 *
 * @author Flavio Waser
 */
public interface IStack<T> {
    
    void push(T element);
    
    T pop();
    
    boolean isEmpty();
    
    boolean isFull();
    
     T peek();
     
     int size();
}
