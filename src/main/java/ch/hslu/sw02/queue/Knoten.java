/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw02.queue;

/**
 *
 * @author Flavio Waser
 */
public class Knoten<T> {
    
    private Knoten<T> next;
    private T data;
    
    public Knoten(Knoten<T> next, T data){
        this.next = next;
        this.data = data;
    }
    
    public Knoten<T> getNext(){
        return next;
    }
    
    public void setNext(Knoten<T> next){
        this.next = next;
    }
    
    public T getData(){
        return data;
    }
    
    public void setData(T data){
        this.data = data;
    }
}
