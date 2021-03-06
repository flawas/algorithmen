/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch.hslu.sw03.Tree;

import java.util.List;

/**
 * Übung: Bäume, Binärbäume und Suchbäume (D2)
 *
 * @author Fabian Gröger
 * @version 13.03.2018
 */
public interface TreeInterface<T extends Comparable<T>> {
    /**
     * Add the given element to the tree.
     *
     * The element has to be sorted properly
     * according to the TreeInterface interface consumer.
     *
     * @param element the element to add
     * @return if the element could be added
     */
    public boolean add(T element);

    /**
     * Remove the given element from the tree.
     *
     * The tree has to ensure the integrity
     * according to the TreeInterface interface consumer.
     *
     * @param element the element to remove
     * @return if the element could be removed
     */
    public boolean remove(T element);

    /**
     * Returns true if this tree search the specified element.
     *
     * @param element the element to search for.
     * @return whether the element was found
     */
    public boolean contains(T element);

    /**
     * Returns the maximum allowed children for each node.
     *
     * @return the maximum allowed children for each node.
     */
    public int getOrder();

    /**
     * Get the degree for the node with the given element.
     *
     * The degree specifies the amount of children
     * a given node has.
     *
     * @param element
     * @return the amount of children the node has.
     */
    public int getDegree(T element);

    /**
     * Returns the path to the given element in the tree.
     *
     * @param element the element for the path
     * @return a list with the path to the given element
     */
    public List<T> getPath(T element);

    /**
     * Returns the depth of the given element in the tree.
     *
     * @param element the element for the depth
     * @return the depth for the given element
     */
    public int getDepth(T element);

    /**
     * Returns the height of the tree.
     *
     * The height is the distance between the root
     * node and the node which is farthest away from the root.
     *
     * @return the tree's height
     */
    public int getHeight();
    public int getHeight(T element);

    /**
     * Returns the weight of the tree.
     *
     * The weight is the amount of nodes the tree
     * has access to.
     *
     * @return the tree's weight
     */
    public int getWeight();
    public int getWeight(T element);
}