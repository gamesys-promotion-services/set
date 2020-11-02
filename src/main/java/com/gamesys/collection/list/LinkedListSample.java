package com.gamesys.collection.list;

import java.util.*;

/**
 * Java introduced LinkedList in version 1.2.
 * This is when the getFirst method has been provided.
 * This message threw NoSuchElementException when the list is empty, causing programmers to do an extra check before the call:​
 * This was an inconvenience, which has been fixed in Java version 1.6 by adding the peekFirst method and other methods of the Dequeue<T> interface.​
 */
public class LinkedListSample {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.getFirst());
    }
}
