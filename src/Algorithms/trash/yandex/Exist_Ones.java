package Algorithms.trash.yandex;

import java.util.HashSet;
import java.util.Set;

public class Exist_Ones {

    //Массив целых чисел,
    //B котором каждое число встречается 2 раза, и лишь
    //одно число встречается
    //1 раз

    //Найти это число

    public int findOneExistNumber(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (set.contains(cur)){
                set.remove(cur);
            }else {
                set.add(cur);
            }
        }
        for (var a : set){
            return a;
        }
        return -1;
    }
}
