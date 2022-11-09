package LeetCode._17_LetterCombinationNumber;

import java.util.*;

public class SolutionA {
    static Map<Integer, Set<Character>> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        init();
        List<String> answerList = null;
        if (digits.length() == 0){
            answerList = new ArrayList<>();
            return answerList;
        }

        int num = Integer.parseInt(digits);
        for (int i = 0; i < digits.length(); i++) {
            int current = num % 10;
            num /= 10;
            answerList = add(answerList, current);
        }
        return answerList;
    }

    static List<String> add(List<String> currentList, int numToAdd){
        List<String> newList = new ArrayList<>();
        Set<Character> set = map.get(numToAdd);
        if (currentList == null){
            for (char cC : set){
                newList.add(String.valueOf(cC));
            }
            return newList;
        }
        for (char cC : set) {
            for (String s : currentList) {
                newList.add(cC + s);
            }
        }
        return newList;
    }
    static void init(){
        map.put(2, new HashSet<>(){{
            add('a');
            add('b');
            add('c');
        }} );
        map.put(3, new HashSet<>(){{
            add('d');
            add('e');
            add('f');
        }} );
        map.put(4, new HashSet<>(){{
            add('g');
            add('h');
            add('i');
        }} );
        map.put(5, new HashSet<>(){{
            add('j');
            add('k');
            add('l');
        }} );
        map.put(6, new HashSet<>(){{
            add('m');
            add('n');
            add('o');
        }} );
        map.put(7, new HashSet<>(){{
            add('p');
            add('q');
            add('r');
            add('s');
        }} );
        map.put(8, new HashSet<>(){{
            add('t');
            add('u');
            add('v');
        }} );
        map.put(9, new HashSet<>(){{
            add('w');
            add('x');
            add('y');
            add('z');
        }} );

    }
}

