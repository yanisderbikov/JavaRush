package LeetCode.generateParenthesis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    static Set<String> combinations = new HashSet<>();
    static Set<Integer[]> comb = new HashSet<>();
    static List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {

        for (int i = 0; i < Math.pow(2,n-1); i++) {
            StringBuilder builder = new StringBuilder("(");
            if (n < 1) {
                String str = genetateStr(n-1);
                builder.append(str);
            }
            builder.append(builder.reverse().toString());// разворачиваем и добавляем
            combinations.add(builder);
        }






    }
    static String genetateStr(int lSubStr){
        // нужно использовать на 1 меньше.
        // метод должен возратить все возможные вариенты комбинаций, но
        // не повторяясь. Т.е. записывать;

        if (!comb.contains(massive)){
            comb.add(massive);
        } else {
            str = genetateStr(lSubStr);
        }
        return str;
    }
    static String gerateOneZero(int lenght){

        int n = (int) Math.pow(2, lenght);
        for (int i = 0; i < n; i++) {
            String str = Integer.toBinaryString(i);
            if (lenght > str.length()){
                StringBuilder builder = new StringBuilder();
                for (int j = 0; j < lenght - str.length(); j++) {
                    builder.append("0");
                }
                builder.append(str);
                list.add(builder.toString());
            } else {
                list.add(str);
            }
        }
    }
}