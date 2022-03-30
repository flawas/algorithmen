/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw02.queue;
import java.util.NoSuchElementException;

/**
 *
 * @author Flavio Waser
 */
public class EinfachVerketteteListe<T> implements IList<T> {
    
    private Knoten<T> head = null;
    private int size = 0;
    
    @Override
    public Knoten<T> getHead(){
        return head;
    }
    
    @Override
    public int getSize(){
        return size;
    }
    
    @Override
    public Knoten<T> add(T element) {
        if(element == null){
            throw new IllegalArgumentException();
        } else {
            head = new Knoten<T> (head, element);
            size++;
            return head;
        }
    }
    
    @Override
    public T pop(){
        if (head == null) {
            throw new NoSuchElementException();
        } else {
            T data = head.getData();
            head = head.getNext();
            size--;
            return data;
        }
    }
    
    @Override
    public void remove(T element) {
        if(element == null){
            throw new IllegalArgumentException();
        } else if(head == null){
            throw new NoSuchElementException();
        } else {
            Knoten<T> currentNode = head;
            Knoten<T> next = currentNode.getNext();
            
            if(isSameElement(element, currentNode)){
                head=  head.getNext();
                size--;
                return;
            }
            
            while(next != null && !isSameElement(element, next)) {
                currentNode = currentNode.getNext();
                next = currentNode.getNext();
            }
            
            if(next != null) {
                currentNode.setNext(next.getNext());
                size--;
            } else {
                throw new NoSuchElementException();
            }
        }
    }
    
    private boolean isSameElement(T element, Knoten<T> node) {
        return element.equals(node.getData());
    }
    
}
