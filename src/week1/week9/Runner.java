package week1.week9;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        ToTable toTable = new ToTable(new int[]{1, 2, 3, 4, 5, 6}, 3, 2);
        int[][] arr = toTable.resize();
        System.out.println(Arrays.deepToString(arr));
        ToLine toLine = new ToLine(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        int[] resize = toLine.resize();
        System.out.println(Arrays.toString(resize));
    }
}
