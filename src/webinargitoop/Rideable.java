package webinargitoop;

public interface Rideable {
    void ride();
    default void swim(){
        System.out.println("swimming");
    }
}
