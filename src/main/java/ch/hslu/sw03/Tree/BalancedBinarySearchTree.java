/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw03.Tree;

import java.util.NoSuchElementException;

/**
 * Übung: Bäume, Binärbäume und Suchbäume (D2)
 *
 * @author Fabian Gröger
 * @version 13.03.2018
 */
public class BalancedBinarySearchTree<T extends Comparable<T>> extends BinarySearchTree<T> {
    /**
     * Add the given element to the tree.
     *
     * @param element the element to add to the tree.
     *
     * @return if the element could be added.
     */
    @Override
    public boolean add(T element) {
        if(!super.add(element)) {
            return false;
        }

        super.balance();
        return true;
    }

    /**
     * Remove the given element from the tree
     *
     * @param element the element to remove from the tree
     *
     * @throws NoSuchElementException
     */
    @Override
    public boolean remove(T element) {
        if(!super.remove(element)) {
            return false;
        }
        super.balance();
        return true;
    }
}
