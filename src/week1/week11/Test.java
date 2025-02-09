package week1.week11;

import java.util.Scanner;

public class Test {
    static Scanner scanner;
    static char [][] map;
    static final int MAP_SIZE = 3;
    static final char EMPTY_FIELD = '1';
    static final char X_FIELD = 'X';
    static final char O_FIELD = 'O';
    static boolean turn = true;
    static boolean endGame = false;
    public static void main(String[] args) {
        newGame();
        printMap();

        char[] result = new char[map.length * map[0].length];
        int count = 0;
        for (char[] datum: map) {
            for (int i = 0; i < datum.length; i++) {
                result[count + i] = datum[i];
            }
            count += datum.length;
        }
        int countX = 0;
        while (countX != MAP_SIZE){
        for (int i = 0; i < result.length; i += 3) {

            if (result[i] == '1'){
                countX++;
                System.out.println("gh");
            }
        }
        System.out.println(result);
        }
    }
    public static void newGame (){
        map = new char[MAP_SIZE][MAP_SIZE];
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                map[i][j] = EMPTY_FIELD;
            }
        }
        scanner = new Scanner(System.in);
    }
    public static void printMap(){
        for (int i = 0; i < MAP_SIZE; i++) {
            System.out.print("[ ");
            for (int j = 0; j < MAP_SIZE; j++) {
                System.out.print("| '" + map[i][j] + "' " + "|");
            }
            System.out.println("] ");
        }
    }
}
