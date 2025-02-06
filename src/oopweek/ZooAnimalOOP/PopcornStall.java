package oopweek.ZooAnimalOOP;

public class PopcornStall implements Soundable{
    public void print(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "It's PopcornStall";
    }
    public void sound() {
        System.out.println("Hey! The best popcorn is here!");
    }
}
