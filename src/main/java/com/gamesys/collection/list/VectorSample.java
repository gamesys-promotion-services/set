package com.gamesys.collection.list;

import java.util.*;

public class VectorSample {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Phone allowance, ");
        vector.addElement("Medicine");
        vector.addElement("WFH Allowance");
        vector.add("Additional Data");

        vector.forEach(System.out::println);
        System.out.println();
        System.out.println("last element: " + vector.lastElement());
        System.out.println("first element: " + vector.firstElement());
        System.out.println("size: " + vector.size());

        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
    }
}
