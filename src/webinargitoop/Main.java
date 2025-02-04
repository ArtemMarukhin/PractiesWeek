package webinargitoop;

public class Main {
    public static void main(String[] args) {
        Car mazda = new Car();
        Car lada = new Car("Lada", 123, false, 20);
        float mazdaSpeed = mazda.countSpeed(5);
        System.out.println(mazdaSpeed);
        System.out.println(lada.countSpeed(5));
    }
}
