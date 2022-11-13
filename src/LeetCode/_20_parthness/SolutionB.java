package LeetCode._20_parthness;

import java.util.HashMap;
import java.util.Map;

public class SolutionB {
    public boolean isValid(String s) {

        if (s == null) return false;

//        int round = 0;
//        int figured = 0;
//        int squared = 0;

        char roundOpen      = '(';
        char figuredOpen    = '{';
        char squaredOpen    = '[';
        char roundClose     = ')';
        char figuredClose   = '}';
        char squaredClose   = ']';

        Map<Character, Character> map = new HashMap<>();
        map.put(    roundOpen,         roundClose      );
        map.put(    figuredOpen,       figuredClose    );
        map.put(    squaredOpen,       squaredClose    );

        for (int i = 1; i < s.length(); i+=2) {
            char preChar = s.charAt(i-1);
            char aftChar = s.charAt(i);
            if (aftChar != map.get(preChar))
                return false;
        }
        return true;
    }

}
