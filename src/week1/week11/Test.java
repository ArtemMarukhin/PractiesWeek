package week1.week11;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    static Scanner scanner;
    static String [][] map;
    static final int MAP_SIZE = 3;
    static final String EMPTY_FIELD = "-";
    static final String X_FIELD = "X";
    static final String O_FIELD = "O";
    static boolean turn = true;
    static boolean endGame = false;
    public static void main(String[] args) {
        newGame();
        printMap();
        String[] sX = new String[MAP_SIZE];
        String[] sO = new String[MAP_SIZE];
        String[] winLine = new String[MAP_SIZE];
        for (int i = 0; i < MAP_SIZE; i++) {
            sX[i] = "X";
        }

        for (int i = 0; i < MAP_SIZE; i++) {
            sO[i] = "O";
        }

        for (int i = 0; i < MAP_SIZE; ) {
            for (int j = 0; j < MAP_SIZE; j++) {
                winLine[i] = map[i][j];
            }
        }
        if (winLine.equals(sX)) System.out.println("XXX");;
        System.out.println(Arrays.toString(winLine));

    }
    public static void newGame (){
        map = new String[MAP_SIZE][MAP_SIZE];
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
