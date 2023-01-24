package LeetCode._844_Backspace_String_compare;

public class Solution {
    public boolean backspaceCompare(String S, String T) {

        int S_pointer = S.length() - 1, T_pointer = S.length() - 1;

        while (S_pointer >= 0 || T_pointer >= 0){
            int S_skips = 0;
            int T_skips = 0;

            while (S_pointer >= 0){
                if (S.charAt(S_pointer) == '#'){
                    S_skips++;
                    S_pointer--;
                }else if (S_skips > 0){
                    S_skips--;
                    S_pointer--;
                }else {
                    break;
                }
            }
            while (T_pointer >= 0){
                if (T.charAt(T_pointer) == '#'){
                    T_skips++;
                    T_pointer--;
                }else if (T_skips > 0){
                    T_skips--;
                    T_pointer--;
                }else {
                    break;
                }
            }

            if (T_pointer >= 0 && S_pointer >= 0
                    && T.charAt(T_pointer) != S.charAt(S_pointer)){
                return false;
            }

            if ((T_pointer >= 0) != (S_pointer >= 0)) return false;

            T_pointer--;
            S_pointer--;
        }
        return true;

    }

}
