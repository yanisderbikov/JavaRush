package LeetCode;


import LeetCode._118_Pascal_triangle.*;


import java.util.*;

//LeetCode._567_Permution_un_String
//import LeetCode._733_Flood_Fill.Solution;
public class Main {

    public static void main(String[] args) {
//        testMaps();
        testStrings();

    }
    private static void testStrings(){
        String a = "abc";
        String b = "abc";
        String aNew = new String("abc");
        System.out.println(a == b);
        System.out.println(a == aNew);


    }
    private static void testMaps(){
        Map<Integer, List<Integer>> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String[] input = scanner.nextLine().split(" ");
            int key = Integer.parseInt(input[0]);
            List<Integer> list = new ArrayList<>();

            for (int j = 1; j < input.length; j++) {
                list.add(Integer.parseInt(input[j]));
            }

            if (map.containsKey(key)){
                map.get(key).addAll(list);
            }else {
                map.put(key, list);
            }
        }
        List<Integer> resultList = new ArrayList<>();
        var a = map.entrySet().stream()
                .flatMap(e -> e.getValue().stream()).toList();
        var b = map.entrySet().stream()
                .map(e -> e.getValue().stream()).toList();
        System.out.println();
    }
    private static boolean check(char[] chars){
        Stack<Character> stack = new Stack<>();
        Set<Character> close = new HashSet<>();
        Set<Character> open = new HashSet<>();

        close.add('}'); open.add('{');
        close.add(']'); open.add('[');
        close.add(')'); open.add('(');
        for (int i = 0; i < chars.length; i++) {
            char cur = chars[i];
            if (close.contains(cur) && !stack.isEmpty()){
                if (stack.pop()-1 != cur) return false;
            }else {
                stack.push(cur);
            }
        }
        return stack.isEmpty();
    }
}
