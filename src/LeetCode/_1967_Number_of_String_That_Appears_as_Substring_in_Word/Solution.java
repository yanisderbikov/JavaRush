package LeetCode._1967_Number_of_String_That_Appears_as_Substring_in_Word;

class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int counter = 0;
        for (int i = 0; i < patterns.length; i++) {
            if (word.indexOf(patterns[i]) != -1) counter++;
        }
        return counter;
    }
}