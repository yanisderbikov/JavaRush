package Algorithms.insertionSort;

public class MineAlgorithm {
    int[] array;
    public int sorting(int[] array){
        this.array = array;
//        int temp;
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            for (int j = i-1; j >= 0 ; j--) {
                int toCompare = array[j];
                if (temp <= toCompare){

                }
            }
        }
        return 1;
    }
}
