//package LeetCode._20_parthness;
//
//public class Solution {
//    public boolean isValid(String s) {
//        int round = 0;
//        int figured = 0;
//        int squared = 0;
//        var roundOpen      = "(";
//        var figuredOpen    = "{";
//        var squaredOpen    = "[";
//        var roundClose     = ")";
//        var figuredClose   = "}";
//        var squaredClose   = "]";
////
////        Map<Character, Integer> map = new HashMap<>(); // K -> Char  V -> +- val
////        map.put(roundOpen, 0);
////        map.put(figuredOpen, 0);
////        map.put(squaredOpen, 0);
////        map.put(roundClose, 0);
////        map.put(figuredClose, 0);
////        map.put(squaredClose, 0);
//
//        if (s == null) return false;
//
//        for (int i = 0; i < s.length(); i++) {
//            char currentChar = s.charAt(i);
//            switch (String.valueOf(currentChar)){
//                case roundClose:
//                    round--;
//                    break;
//                case roundOpen:
//                    round++;
//                    break;
//                case figuredClose:
//                    figured--;
//                    break;
//                case figuredOpen:
//                    figured++;
//                    break;
//                case squaredClose:
//                    squared--;
//                    break;
//                case squaredOpen:
//                    squared++;
//                    break;
//                default:
//                    return false;
//
//            }
//        }
//        if (round != 0 || squared != 0 || figured != 0){
//            return false;
//        }
//        return true;
//    }
//}
