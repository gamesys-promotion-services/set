package com.gamesys.collection.set;

import java.util.*;

public class HashSetSample {

    public static void main(String[] args){
        Set<String> hashSet = new HashSet<>();
        System.out.println("hashset");
        hashSet.addAll(populateList());
        hashSet.forEach(System.out::println);

        System.out.println();
        System.out.println("arraylist");
        List<String> arrayList = new ArrayList<>();
        arrayList.addAll(populateList());
        arrayList.forEach(System.out::println);

    }

    private static List populateList() {
        return Arrays.asList("1","2","3","Phone Allowance",
                "Medicine Allowance",
                "WFH Allowance",
                null,
                "Phone Allowance",
                null,
                "Beer Allowance",
                "4","5","6","12","7","8","9","10","11","11");
    }
}
