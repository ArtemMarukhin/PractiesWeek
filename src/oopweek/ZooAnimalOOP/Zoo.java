package oopweek.ZooAnimalOOP;

public class Zoo {
    Object[] animals;

    public Zoo() {
        animals = new Object[3];

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Reptile();
    }

    public void print(){
        for(Object a : animals){
            System.out.println(a);;
        }
    }
    public void sound(){
        for(Object a : animals){
            if(a instanceof Soundable){
                ((Soundable)a).sound();
            }
        }
    }


    public void change(Object a, int i){
        if (i >= 0 && i < animals.length){
            animals[i] = a;
        }
    }

}
