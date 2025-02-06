package oopweek.ZooAnimalOOP;

public class Reptile extends Animal{
    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I am a Reptile";
    }
}
