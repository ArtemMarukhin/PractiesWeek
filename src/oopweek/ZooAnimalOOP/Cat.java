package oopweek.ZooAnimalOOP;

public class Cat extends Animal implements Soundable{
    @Override
    public void print() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "i am a Cat";
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }
}
