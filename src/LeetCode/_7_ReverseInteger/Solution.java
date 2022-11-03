package LeetCode._7_ReverseInteger;
class Solution {
    public int reverse(int x) {
        if (x == 0){
            return 0;
        }
        String str = String.valueOf(x);
        StringBuilder builder = new StringBuilder(str);
        boolean isDeleted = false;
        if (builder.charAt(0) == '-' ){
            builder.delete(0, 1);
            isDeleted = true;
        }
        builder.reverse();
        if (builder.charAt(0) == '0') {
            builder = delete(builder);
        }
        if (isDeleted){
            return compare("-" + builder.toString());
        }
        return compare(builder.toString());
    }


    static StringBuilder delete(StringBuilder builder){
        builder.delete(0,1);
        if (builder.charAt(0) == '0'){
            delete(builder);
        }
        return builder;
    }

    static int compare(String str){
        var a = Long.parseLong(str);
        if ((int) a > Math.pow(-2, 31) || (int) a < Math.pow(2,31)){
            return (int) a;
        }
        return 0;
    }
}