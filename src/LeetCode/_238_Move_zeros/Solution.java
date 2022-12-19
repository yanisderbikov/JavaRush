package LeetCode._238_Move_zeros;

public class Solution {
    public void moveZeroes(int[] nums) {
        /*
        Если мы встретили ноль, то мы запоминаем его позицию, и идем дальше
        если дальше мы встретили какое-то число != 0, то мы его ставим, на
        предыдущую позицую, а то где мы сейчас, ставим 0;

        { 1, 3, 0 ,5, 1 } i = 0; lastZero == -1;
        { 1, 3, 0 ,5, 1 } i = 1; lastZero == -1;
        { 1, 3, 0 ,5, 1 } i = 2; lastZero == -1 -> 2; встретили 0, запомнили его поз.
        { 1, 3, 5 ,0, 1 } i = 3; lastZero == 2 -> 3; далеее меняем и увеличиваем lastZero
        { 1, 3, 5 ,1, 0 } i = 4; lastZero == 3 -> 4;

        */

//        {1, 0, 4, 0}
//        {0, 3, 4, 0}

        int lastZero = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && lastZero == -1){
//                если встретили первый раз
                lastZero = i;
            }else if (nums[i] != 0 && lastZero != -1){
//                теперь нужно потсавить на предыдущее значение текущее,
//                а на текущее поставить 0
//                int temp = nums[i];
                nums[lastZero++] = nums[i];
                nums[i] = 0;
//                lastZero++;
            }
        }
    }
}
