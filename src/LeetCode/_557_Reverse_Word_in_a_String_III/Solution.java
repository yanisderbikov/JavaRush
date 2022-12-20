package LeetCode._557_Reverse_Word_in_a_String_III;

public class Solution {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        String out = "";
        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            int left = 0;
            int right = arr.length - 1;
            while (left < right){
                char temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
            if (i == strs.length - 1){
                out += String.valueOf(arr);
                return out;
            }else {
                out += String.valueOf(arr) + " ";
            }
        }
        return null;
    }
}
