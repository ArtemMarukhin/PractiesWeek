package oopweek;

public class Cat extends Animal{
    public void sound(){
        System.out.println("Meow");
    }

    public Cat() {
        super(false, "milk and meat");
    }
}
