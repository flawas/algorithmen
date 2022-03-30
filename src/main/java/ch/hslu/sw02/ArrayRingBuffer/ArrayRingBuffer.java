/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw02.ArrayRingBuffer;

/**
 *
 * @author Flavio Waser
 */
public class ArrayRingBuffer<T> implements IQueue<T>{
    private final T[] queue;
    private final int capacity;
    
    private int indexTail = -1;
    private int indexHead = 0;
    private int numberOfElementsInQueue = 0;
    
    public ArrayRingBuffer(int size) {
        this.capacity = size;
        this.queue = (T[]) new Object [size];
    }
    
    @Override
    public boolean offer(T element){
        if(isFull()) {
            return false;
        } else {
            indexTail++;
            numberOfElementsInQueue++; 
            queue[indexTail % capacity] = element;
            return true;
        }
    }
    
    @Override
    public T poll() {
        if(isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            T element = queue[indexHead % capacity];
            indexHead++;
            numberOfElementsInQueue--;
            return element;
        }
    }
    
    @Override
    public T peek() {
        if (isEmpty()){
            return null;
        } else {
            return queue[indexHead % capacity];
        }
    }
    
    @Override
    public boolean isFull() {
        return this.capacity == numberOfElementsInQueue;
    }
    
    @Override
    public boolean isEmpty() {
        return numberOfElementsInQueue == 0;
    }
    
    @Override
    public String toString() {
        return "ArrayRingBuffer{" + 
                "indexHead: " + indexHead + ", " + 
                "indexTail: " + indexTail +  ", " + 
                "numberOfElementsInQueue: " + numberOfElementsInQueue + ", " +
                "capacity: " + capacity 
                + "}";
    }
    
}
