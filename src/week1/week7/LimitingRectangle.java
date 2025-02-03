package week1.week7;

public class LimitingRectangle {
    int[][] points;

    public LimitingRectangle(int[][] points) {
        this.points = points;
    }

    int min (int ind){
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            if(points[i][ind] <= minValue){
                minValue = points[i][ind];
            }
        }
        return minValue;
    }
    int max (int ind){
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < points.length; i++) {
            if(points[i][ind] >= maxValue){
                maxValue = points[i][ind];
            }
        }
        return maxValue;
    }
    
    int getWeight(){
        return this.max(0) - this.min(0);
    }

    int getHeight(){
        return this.max(1) - this.min(1);
    }

    String getBorders(){
        return this.min(1) + ", " + this.max(1) + ", " + this.min(0) + ", " + this.max(0);    }
}
