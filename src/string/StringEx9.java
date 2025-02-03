package string;

import java.util.Scanner;

public class StringEx9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean isCorrectName = false;
            while (!isCorrectName) {
                String name = scanner.nextLine();
                isCorrectName = checkName(name);
                if (!isCorrectName) {
                    System.out.println("Введите корректное имя!");
                } else {
                    System.out.println("верно");
                }
            }
        }

        private static boolean checkName(String name) {
            String[] words = name.trim().split(" ");
            return words.length == 3;
        }

}
