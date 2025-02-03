package week1.week9;

public class ToTable {
    int data[];
    int x, y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    int[][] resize(){
        int[][] result = new int[x][y];
        int countData = 0;
        for (int i = 0; i < x; i++) {
            int countY = countData + y;
            for (int j = countData; j < countY; j++) {
                result[i][j - countData] = data[j];
            }
            countData += y;
        }
        return result;
    }


}
