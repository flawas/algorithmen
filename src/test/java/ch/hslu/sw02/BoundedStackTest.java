/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ch.hslu.sw02;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for BoundedStack.
 */
public class BoundedStackTest extends StackTest {
    private static int CAPACITY = 40;

    @Before
    public void makeBoundedStack() {
        s = new BoundedStack(CAPACITY);
    }

    @Test(expected = IllegalStateException.class)
    public void testPushToFullStack() {
        for (int i = 0; i < CAPACITY; i++) {
            s.push("abc");
        }
        s.push("abc");
    }
}
