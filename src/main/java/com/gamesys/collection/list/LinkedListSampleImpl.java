package com.gamesys.collection.list;

import java.util.*;

public class LinkedListSampleImpl {

    static List <String> allowance = Arrays.asList("Cake Allowance",
            "Pizza Allowance",
            "Netflix Allowance",
            "Spotify Allowance");

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println("linkedList");
        linkedList.addAll(populateList());

        System.out.println(linkedList);
        System.out.println("");

        linkedList.addLast("Foodpanda Allowance");
        System.out.println("add last: "+linkedList);
        System.out.println("");

        linkedList.removeLastOccurrence("Phone Allowance");
        System.out.println("remove last occurence "+linkedList);
        System.out.println("");

        /**
         * Exercise! 5-10 mins
         * Add "allowance" into the "linkedList"
         * Cake Allowance must be replaced with "Burrito Allowance",
         * Print out the value
         */

        System.out.println("Exercise: "+ linkedList);

        /**
         * Output should be
         Exercise: [Phone Allowance, Medicine Allowance, WFH Allowance, Beer Allowance, Foodpanda Allowance,
         Burrito Allowance, Pizza Allowance, Netflix Allowance, Spotify Allowance]
         */

    }

    private static List populateList() {
        return Arrays.asList("Phone Allowance",
                "Medicine Allowance",
                "WFH Allowance",
                "Phone Allowance",
                "Beer Allowance");
    }


}
