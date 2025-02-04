package webinargitoop;

public class Car {
    String brand;
    int horsePower;
    boolean isAwd;
    float acceleration;
    Car(){
        this("mazda", 190, false, 10);
    }

    public Car(String brand, int horsePower, boolean isAwd, float acceleration) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
    }

    void start(){
        System.out.println(brand+ " has been started");
    }

    void setAcceleration(float acceleration){
        this.acceleration = acceleration;
    }

    float countSpeed(float time){
        return (100/acceleration)*time;
    }


}
