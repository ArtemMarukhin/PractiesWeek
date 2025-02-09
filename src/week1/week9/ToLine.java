package week1.week9;

public class ToLine {

    int[][] data = {{1, 2}, {3, 4}, {5, 6}};

    public ToLine(int[][] data) {
        this.data = data;
    }

    int[] resize(){
        int[] result = new int[data.length * data[0].length];
        int count = 0;
        for (int[] datum: data) {
            for (int i = 0; i < datum.length; i++) {
                result[count + i] = datum[i];
            }
            count += datum.length;
        }
        return result;

    }
}
