package LeetCode._917_Reverse_Only_Letters;

public class Solution_first {
    public String reverseOnlyLetters(String s) {
        var chars = s.toCharArray();
        reverse(chars);

        String out = "";
        for (var c : chars){
            out = out + c;
        }

        return out;
    }
    private void reverse(char[] chars) {
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            while (left < right && !Character.isLetter(chars[left])) {
                left++;
            }
            while (left < right && !Character.isLetter(chars[right])) {
                right--;
            }
            if (left < right) {
                char temp = chars[left];
                chars[left++] = chars[right];
                chars[right--] = temp;
            }
        }
    }
}
