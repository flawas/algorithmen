/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch.hslu.sw05.balls;
import java.awt.*;
import javax.swing.*;

/**
 * Übung: Threads & Synchronisation (N1)
 * Aufgabe: Ballspiele
 *
 * @author Fabian Gröger
 * @version 29.03.2018
 */
public class App extends JFrame {
    private DrawingArea area = new DrawingArea();

    public static void main(String args[]) {
        new App();
    }

    public App() {
        super("EX04 Ballspiele");
        getRootPane().setLayout(new GridBagLayout());
        getRootPane().add(area, new GridBagConstraints());
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}