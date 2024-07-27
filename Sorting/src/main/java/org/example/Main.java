package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("banana");
        arr.add("apple");
        arr.add("peach");
        arr.add("cherry");
        arr.add("jackfruit");

        System.out.println(arr);

        Collections.sort(arr);

        System.out.println(arr);
    }
}