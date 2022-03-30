/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw02.list;

/**
 * 
 * @author Flavio Waser
 */
public class SimpleList {

    /**
     * Attributte der Klasse.
     *
     */
    SimpleListElement startElement = new SimpleListElement("HEAD");
    
    /**
     * Konstruktor der Klasse.
     *
     */
    public SimpleList() {
    }
    
    /**
    * Methoden der Klasse.
    *
    */
    public void addToListAtEnd(Object o) {
        SimpleListElement newElement = new SimpleListElement(o);
        SimpleListElement lastElement = getLastElement();
        lastElement.setNextElement(newElement); 
    }
    
    public void addToListInsertAfter(Object prevItem, Object newItem){
        SimpleListElement newElement, nextElement, pointerElement;
        pointerElement = startElement.getNextElement();
        while(pointerElement != null && !pointerElement.getObject().equals(prevItem)) {
            pointerElement = pointerElement.getNextElement();
        }
        
        newElement = new SimpleListElement(newItem);
        nextElement = pointerElement.getNextElement();
        pointerElement.setNextElement(newElement);
        newElement.setNextElement(nextElement);
        
    }
    
    public void deleteFromList(Object o) {
        SimpleListElement le = startElement;
        
        while(le.getNextElement() != null && !le.getObject().equals(o)){
             if(le.getNextElement().getObject().equals(o)){ 
                if(le.getNextElement().getNextElement()!=null){
                    le.setNextElement(le.getNextElement().getNextElement()); 
                } else {
                    le.setNextElement(null);
                    break;
                }
             }
             le = le.getNextElement(); 
        }
    }
    
    public boolean findObject(Object o){
        SimpleListElement le = startElement;
        while (le != null){
            if(le.getObject().equals(o)){
                return true;
            } else {
                le = le.nextElement;
            }
        }
        return false;
    }
    
    public int getSize(){
        SimpleListElement le = startElement;
        int counter = 0;
        while (le != null){
            counter++;
            le = le.nextElement;
        }
        return counter;
    }
    
    public Object getAndRemoveFirstElement(){
        Object secondElement =  startElement.getNextElement().getObject();
        deleteFromList(secondElement);
        return secondElement;
    }
    
    public SimpleListElement getFirstElement() {
        return startElement;
    }
    
    public SimpleListElement getLastElement() {
        SimpleListElement le = startElement;
        while (le.getNextElement() != null) {
            le = le.getNextElement();
        }
        return le;
    }
    
    public void writeList() {
        SimpleListElement le = startElement;
        while(le != null) {
            System.out.println(le.getObject());
            le = le.getNextElement();
        }
    }

}
