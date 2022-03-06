/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw02;

/**
 *
 * @author flaviowaser
 */
import java.util.LinkedList;

/**
 * A stack class implemented as a wrapper around a java.util.LinkedList. All
 * stack methods simply delegate to LinkedList methods.
 */
public class SimpleStack implements Stack {
    private LinkedList<Object> list = new LinkedList<Object>();

    public void push(Object item) {
        list.addFirst(item);
    }

    public Object pop() {
        return list.removeFirst();
    }

    public Object peek() {
        return list.getFirst();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
