package LeetCode.generateParenthesis;

import java.util.ArrayList;
import java.util.List;

public class subSol {
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        int lenght = 2;
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
        printS();



    }
    static void printS(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
