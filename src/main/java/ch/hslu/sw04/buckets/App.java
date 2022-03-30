/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw04.buckets;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Übung: Hashbasierte Datenstrukturen, Performance, Thirdparty-Datenstrukturen (D3)
 * Aufgabe: Hashtabelle mit Buckets (Listen für Kollisionen)
 *
 * @author Fabian Gröger
 * @version 19.03.2018
 */
public class App {

    private static final Logger LOGGER = LogManager.getLogger(App.class);

    /**
     * Privater Konstruktor.
     */
    private App() {
    }

    /**
     * Main-Methode.
     *
     * @param args Startargumente.
     */
    public static void main(final String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.add("a");
        hashTable.add("a");
        hashTable.add("b");

    }
}
