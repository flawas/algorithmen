/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch.hslu.sw02.queue;

/**
 *
 * @author Flavio Waser
 */
public interface IList<T> {
    
    /**
    * Gibt das zuletzt hinzugefügte Knoten-Element der Liste zurück.
    * @return Head-Knoten
    */
    Knoten<T> getHead();
    
    /**
    * Gibt die Anzaahl an Knoten in der Liste zurück
    * @return Grösse der Kette
    */
    int getSize();
    
    /**
     * Fügt ein neues Objekt der Liste hinzu
     * @param element Objekt, welches der Liste hinzugefügt werden soll
     * @return Neu erstelltes Knoten-Element (Head)
     */
    Knoten<T> add(T element);
    
    /**
     * Gibt Head-Knoten zurück und löscht diesen anschliessend. 
     * @return Head-Knoten (vor der Löschung)
     */
    T pop();
    
    /**
     * Entfernt ein Objekt aus der Liste
     * @param element Objekt, welches aus der LIste entfernt werden soll
     */
    void remove(T element);
    
}
