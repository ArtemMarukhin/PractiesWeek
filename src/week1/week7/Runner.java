package week1.week7;

public class Runner {
    public static void main(String[] args) {
        LimitingRectangle r = new LimitingRectangle(new int[][] {{-1, -2}, {3, 4}});
        System.out.println(r.getWeight() + " " + r.getHeight());
        System.out.println(r.getBorders());    }
}
