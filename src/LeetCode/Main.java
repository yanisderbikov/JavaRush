package LeetCode;


import LeetCode._118_Pascal_triangle.*;


import java.util.*;

//LeetCode._567_Permution_un_String
//import LeetCode._733_Flood_Fill.Solution;
public class Main {

    public static void main(String[] args) {
//        testMaps();
//        testStrings();
//        System.out.println(romanToInt("III"));
//        int[] arr = {1,3,-1,-3,5,3,6,7};
        String str = "AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        System.out.println(sol1(str));
        int[] arr = {1, 4, 2, 3};
        int k = 4;

        double[] d = medianSlidingWindow(arr, k);

    }
    private static String sol1(String s)  {
        char last = s.charAt(0);
        int counter = 0;
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur != last){
                if (counter == 1){
                    output = output + cur;
                }else {
                    output = output + counter + cur;
                }
                last = cur;
                counter = 0;
            }
            counter++;
        }
        return output;
    }

    private static double[] medianSlidingWindow(int[] nums, int k) {
        int left = 0;
        int right = k - 1;
        int len = nums.length - right;
        double[] result = new double[len];
        int i = 0;
        while (right < nums.length){
            int[] copy = Arrays.copyOfRange(nums, left, right + 1);
            Arrays.sort(copy);
            if (k % 2 == 0){
                int mid = (right - left) / 2;
                result[i++] = ((double) copy[mid] * (double) copy[mid + 1]) / (double) 2;
            }else {
                result[i++] = (double) copy[(right - left) / 2];
            }
            right++;
            left++;
        }
        return result;
    }

    private static int romanToInt(String s) {
        int current = 0;
        int last = 0;
        int result = 0;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            char cur = s.charAt(i);
            switch (cur) {
                case 'I' -> current = 1;
                case 'V' -> current = 5;
                case 'X' -> current = 10;
                case 'L' -> current = 50;
                case 'C' -> current = 100;
                case 'D' -> current = 500;
                case 'M' -> current = 1000;

            }
            if (current >= last) result += current;
            else result -= current;
            last = current;
        }
        return result;
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
