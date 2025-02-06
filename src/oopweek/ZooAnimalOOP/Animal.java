package oopweek.ZooAnimalOOP;

public abstract class Animal {
    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "I am an Animal";
    }
}
