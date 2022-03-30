/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw02.stack;

//import java.util.EmptyStackException;
import java.util.EmptyStackException;


/**
 *
 * @author Flavio Waser
 */
public class ArrayStack<T> implements IStack<T> {
    
    private final T[] stack;
    private int lastElement = -1;
    
    public ArrayStack(int size){
        stack = (T[]) new Object[size];
    }
    
    @Override
    public void push(T element) {
        if (isFull()) {
            throw new StackOverflowError();
        } else {
            lastElement++;
            stack[lastElement] = element;            
        }

    }
    
    @Override
    public T pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        } else {
            T element = stack[lastElement];
            stack[lastElement] = null;
            lastElement--;
            return element;
        }
    }
    
    @Override
    public boolean isEmpty() {
        return lastElement == -1;
    }
    
    @Override
    public boolean isFull() {
        return stack.length - 1 == lastElement;
    }

    
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stack[lastElement];
        }
    }
    
    @Override
    public int size() {
        return stack.length;
    }
    
}
