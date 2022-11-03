package LeetCode.generateParenthesis;

import java.util.*;

class Solution {
    static Set<String> combinations = new HashSet<>();
    static List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {

        generateOneZero(n - 1); // generated list with possible combinations
        for (int i = 0; i < list.size(); i++) {
            StringBuilder builder = new StringBuilder("(");
            if (n > 1) {
                String str = convertZeroToParentheses(i);
                builder.append(str);
                builder.append(reverseStr(builder.toString()));
            } else {
                builder.append(')');
            }

            combinations.add(builder.toString());
        }
        List<String> strings = combinations.stream().toList();

        List<String> reverseList = new ArrayList<>();
        for (int i = strings.size() - 1; i >= 0 ; i--) {
            reverseList.add(strings.get(i));
        }
        return reverseList;

    }
    static String reverseStr(String str){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            builder.append(str.charAt(i) == '(' ? '(' : ')');
        }
        return builder.reverse().toString();
    }

    static String convertZeroToParentheses(int i){
        String s = list.get(i);
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < s.length(); j++) {
//             x ? y : z
            builder.append(s.charAt(j) == '0' ? '(' : ')');
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