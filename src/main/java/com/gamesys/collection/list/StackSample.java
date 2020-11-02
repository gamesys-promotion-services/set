package com.gamesys.collection.list;

import java.util.*;

public class StackSample {

    public static void main(String[] args) {
        Stack<String> stackOfString = new Stack<>();
        stackOfString.add("Phone allowance");
        stackOfString.add("Medicine Allowance");
        stackOfString.add("WFH Allowance");
        stackOfString.add("Additional Data");

        stackOfString.forEach(System.out::println);
        System.out.println("");

        System.out.println("isEmpty: " + stackOfString.isEmpty());
        System.out.println("peek: " + stackOfString.peek());
        System.out.println("pop: " + stackOfString.pop());
        System.out.println("");

        System.out.println("push: " + stackOfString.push("Beer allowance"));
        System.out.println("");

        stackOfString.forEach(System.out::println);
        System.out.println("");

        System.out.println("search medicine index " + stackOfString.search("Medicine Allowance"));
    }
}
