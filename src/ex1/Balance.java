package ex1;

import java.util.Random;
import java.util.Scanner;

public class Balance {
    public static void main(String[] args) {
        Random random = new Random();
        int randInt;
        Scanner scanner = new Scanner(System.in);
        int diapozon = scanner.nextInt();
        randInt = random.nextInt(diapozon);
        int popitki = scanner.nextInt();
        int counter = 1;
        System.out.println(randInt);
            while (counter <= popitki) {
                Scanner scannerUser = new Scanner(System.in);
                int value = scannerUser.nextInt();
                counter++;
                if (value > randInt) {
                    System.out.println("Число меньше");
                } else if (value == randInt) {
                    System.out.println("Вы угадали");
                    break;
                } else {
                    System.out.println("Число больше");
                }

            }
    }


}

