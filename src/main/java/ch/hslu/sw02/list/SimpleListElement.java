/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw02.list;

/**
 *
 * @author Flavio Waser
 */
public class SimpleListElement {
    
    Object obj;
    
    SimpleListElement nextElement;
    
    public SimpleListElement(Object obj){
        this.obj = obj;
        nextElement = null;
    }
    
    public void setNextElement (SimpleListElement nextElement){
        this.nextElement = nextElement;
    }
    
    public SimpleListElement getNextElement() {
        return nextElement;
    }
    
    public Object getObject(){
        return obj;
    }
    
}
