package LeetCode;

import java.util.TreeMap;

public class Main2 {
    public static void main(String[] args) {
        // creating tree map
        TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();

        // populating tree map
        treemap.put(2, "two");
        treemap.put(1, "one");
        treemap.put(3, "three");
        treemap.put(6, "six");
        treemap.put(5, "five");

        System.out.println("Checking first key");
        System.out.println("First key is: "+ treemap.firstKey() + " val : " + treemap.get(1));

        treemap.put(1, "one_next");
        System.out.println("First key is: "+ treemap.firstKey() + " val : " + treemap.get(1));

    }
}
