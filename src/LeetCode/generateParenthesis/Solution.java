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
        List<String> result = new ArrayList<>();
        generateOneZero(n - 1); // generated list with possible combinations

        for (int i = 0; i < list.size(); i++) {

            StringBuilder builder = new StringBuilder("(");
            String str = convertZeroToParentheses(i);
            builder.append(str);
            builder.append(builder.reverse());// разворачиваем и добавляем
            combinations.add(builder.toString());
        }

        return combinations.stream().toList();
    }


    static String convertZeroToParentheses(int i){
        String s = list.get(i);
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < s.length(); j++) {
//             x ? y : z
            builder.append(s.charAt(i) == '0' ? '(' : ')');
        }
        return builder.toString();
    }
    static void generateOneZero(int lenght){
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