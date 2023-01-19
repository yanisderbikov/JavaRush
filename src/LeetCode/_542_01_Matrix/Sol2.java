package LeetCode._542_01_Matrix;

public class Sol2 {
    // DOESNT WORK
    public int[][] updateMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1){
                    int res = fill(mat, i, j, 0);
                    mat[i][j] = res;
                }
            }
        }
        return mat;
    }

    int fill(int[][] nums, int row, int colomn, int counter){
        if (row < 0 || colomn < 0 || row >= nums.length || colomn >= nums[0].length ||
                nums[row][colomn] == 0){
            return 0;
        }

        counter++;

        int a = fill(nums, row, colomn+1, counter) + counter;
        int b = fill(nums, row+1, colomn, counter) + counter;
        int c = fill(nums, row, colomn-1, counter) + counter;
        int d = fill(nums, row-1, colomn, counter) + counter;

        return Math.min(Math.min(a, b), Math.min(a,b));
    }
}
