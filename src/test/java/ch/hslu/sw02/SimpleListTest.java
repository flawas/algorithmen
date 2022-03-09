/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ch.hslu.sw02;

import ch.hslu.sw02.list.SimpleList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author flaviowaser
 */
public class SimpleListTest {
    
    public SimpleListTest() {
    }

    @Test
    public void testListCreateList(){
        SimpleList list = new SimpleList(); 
    }
    
    @Test
    public void testAddToListAtEndOneItem() {
        SimpleList list = new SimpleList(); 
        list.addToListAtEnd("1");
    }
    
    @Test
    public void testAddToListAtEndMultipleItems(){
        SimpleList list = new SimpleList(); 
        list.addToListAtEnd("123");     
        list.addToListAtEnd("987123");     
        list.addToListAtEnd("123");     
        list.addToListAtEnd("44");
        Assertions.assertEquals("44", list.getLastElement().getObject());
    }
    
    @Test
    public void testAddToListInsertAfter(){
        SimpleList list = new SimpleList(); 
        list.addToListAtEnd("928734");     
        list.addToListAtEnd("0912384087");     
        list.addToListAtEnd("123");     
        list.addToListAtEnd("8329874923749");
        list.addToListInsertAfter("123", "neu"); 
        Assertions.assertEquals(true, list.findObject("neu"));
    }
    
    @Test
    public void testDeleteItem(){
        SimpleList list = new SimpleList(); 
        list.addToListAtEnd("123");     
        list.addToListAtEnd("987123");     
        list.addToListAtEnd("123");     
        list.deleteFromList("987123");
        Assertions.assertEquals(false, list.findObject("987123"));
    }
    
    @Test
    public void testWriteList(){
        SimpleList list = new SimpleList(); 
        list.addToListAtEnd("123");     
        list.addToListAtEnd("987123");     
        list.addToListAtEnd("123");     
        list.writeList();
        list.getFirstElement().equals("123");
    }
    
    @Test
    public void testCounter(){
        SimpleList list = new SimpleList(); 
        list.addToListAtEnd("123");     
        list.addToListAtEnd("987123");     
        list.addToListAtEnd("123");     
        list.addToListAtEnd("92138704");     
        Assertions.assertEquals(5, list.getSize());
        }
    
    @Test
    public void testFindObject(){
        SimpleList list = new SimpleList(); 
        list.addToListAtEnd("2134");     
        list.addToListAtEnd("928374");     
        list.addToListAtEnd("alksdjh");     
        list.addToListAtEnd("9283z4hui");     
        Assertions.assertEquals(true, list.findObject("9283z4hui"));
    }
    
    @Test
    public void testFindObjectNA(){
        SimpleList list = new SimpleList(); 
        list.addToListAtEnd("2134");     
        list.addToListAtEnd("928374");     
        list.addToListAtEnd("alksdjh");     
        list.addToListAtEnd("lidqsuaf");     
        Assertions.assertEquals(false, list.findObject("9283z4hui"));        
    }
    
    @Test
    public void testGetAndRemoveFirstElement(){
        SimpleList list = new SimpleList(); 
        list.addToListAtEnd("oiwquzer");     
        list.addToListAtEnd("oqiuewr");     
        list.addToListAtEnd("ölajksdf");     
        list.addToListAtEnd("askldjf");   
        Assertions.assertEquals("oiwquzer", list.getAndRemoveFirstElement());        
        Assertions.assertEquals(false, list.findObject("oiwquzer"));        
    }    
    
}
