package LeetCode._733_Flood_Fill;

public class Solution {
    public int[][] floodFill(int[][] image, int row, int colom, int colorPaintTo) {
        if (image[row][colom] == colorPaintTo) return image;
        fill(image, row, colom, image[row][colom], colorPaintTo);
        return image;
    }
    public void fill(int[][] image, int row, int colom, int currentColor, int colorPaintTo){
        if (row < 0 || row >= image.length || colom < 0 || colom >= image[0].length
                || image[row][colom] != currentColor) {
            return;
        }
        image[row][colom] = colorPaintTo;
        fill(image,  row+1, colom, currentColor, colorPaintTo);
        fill(image,  row-1, colom, currentColor, colorPaintTo);
        fill(image,  row, colom+1, currentColor,  colorPaintTo);
        fill(image,  row, colom-1, currentColor,  colorPaintTo);
    }
}
