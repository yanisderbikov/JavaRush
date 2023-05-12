package test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("0000");


        String str = q.poll();
        for (int i = 0; i < 4; i++) {
            StringBuilder builder = new StringBuilder(str);
            char c = builder.charAt(i);
            builder.deleteCharAt(i);
            StringBuilder sb1 = new StringBuilder(builder.toString());
            StringBuilder sb2 = new StringBuilder(builder.toString());
            sb1.insert(i, c == '9' ? 0 :  c - '0' + 1);
            sb2.insert(i, c == '0' ? 9 :  c - '0' - 1);
            q.offer(sb1.toString());
            q.offer(sb2.toString());
        }
        System.out.println();
//        isLongPressedName("zlexya", "aazlllllllllllllleexxxxxxxxxxxxxxxya");
    }
    public static boolean isLongPressedName(String name, String typed) {
        if (typed.length() < name.length()) return false;
        int n = typed.length();
        int first_pointer = 0;
        int second_pointer = 0;
        char last = typed.charAt(0);
        while (second_pointer < n){
            if (first_pointer < name.length() && name.charAt(first_pointer) == typed.charAt(second_pointer)){
                last = typed.charAt(second_pointer);
                second_pointer++;
                first_pointer++;
            }else if (typed.charAt(second_pointer) == last){
                second_pointer++;
            }else {
                return false;
            }
        }
        if (first_pointer < name.length() || second_pointer < typed.length()) return false;
        return true;
    }
}
