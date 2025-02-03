package ex2;

public class Runner {
    public static void main(String[] args) {
        One one = new One("1", 5, 2,true);
        Two two = new Two("1", 5, 1,true);
        fight(one, two);
    }

    public static void fight(One one, Two two){
        while (true){
            if (one.alive && !two.alive){
                System.out.println("one win");
                break;
            } else if (!one.alive && two.alive) {
                System.out.println("two win");
                break;
            } else if (!one.alive && !two.alive) {
                System.out.println("all dead");
                break;
            }
            if (one.health < 1){
                one.alive = false;
            } else {
                one.health -= two.damage;
            }
            if (two.health < 1){
                two.alive = false;
            } else {
                two.health -= one.damage;
            }
        }
    }
}
