package week1.week11;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
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
        getField();
        startGame();
    }


    public static boolean checkWin(String playerField){
//        if (map[0][0].equals(playerField) && map[0][1].equals(playerField) && map[0][2].equals(playerField))            return true;
//        if (map[1][0].equals(playerField) && map[1][1].equals(playerField) && map[1][2].equals(playerField))            return true;
//        if (map[2][0].equals(playerField) && map[2][1].equals(playerField) && map[2][2].equals(playerField))            return true;
//
//        if (map[0][0].equals(playerField) && map[1][0].equals(playerField) && map[2][0].equals(playerField))            return true;
//        if (map[0][1].equals(playerField) && map[1][1].equals(playerField) && map[2][1].equals(playerField))            return true;
//        if (map[0][2].equals(playerField) && map[1][2].equals(playerField) && map[2][2].equals(playerField))            return true;
//
//        if (map[0][0].equals(playerField) && map[1][1].equals(playerField) && map[2][2].equals(playerField))            return true;
//        if (map[0][2].equals(playerField) && map[1][1].equals(playerField) && map[2][0].equals(playerField))            return true;

//        for (int i = 0; i < MAP_SIZE; i++) {
//            boolean check = true;
//            for (int j = 0; j < MAP_SIZE; j++) {
//                if (map[i][j].equals(playerField)) check = false;
//            }
//            if (check) return true;
//        }
//
//        for (int i = 0; i < MAP_SIZE; i++) {
////            boolean check = true;
//            for (int j = 0; j < MAP_SIZE; j++) {
//                if (map[j][i].equals(playerField) || map[j][i].equals(EMPTY_FIELD)) return true;
//            }
////            if (check) return true;
//        }
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
        System.out.println(Arrays.toString(winLine));

        return false;

    }

    public static void startGame(){
        while (!endGame){
            if(!endGame){
                xTurn();
                if(checkWin(X_FIELD)){
                    System.out.println("Победа X");
                    endGame = true;
                    break;
                }
                if(checkDraft()){
                    System.out.println("Ничья");
                }
            }
            if(!endGame){
                oTurn();
                if(checkWin(O_FIELD)){
                    System.out.println("Победа O");
                    endGame = true;
                    break;
                }
                if(checkDraft()){
                    System.out.println("Ничья");
                }
            }
        }
    }

    public static boolean checkDraft(){
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                if (map[i][j].equals(EMPTY_FIELD)){
                    return false;
                }
            }
        }
        endGame = true;
        return true;
    }

    public static boolean isCellValid(int x, int y){
        if(x< 0 || y < 0 || x >= MAP_SIZE || y >= MAP_SIZE){
            return false;
        }
        if(!map[y][x].equals(EMPTY_FIELD)){
            return false;
        }
        return true;
    }

    public static void oTurn(){
        int x, y;
        do {
            System.out.println("Ход O: ");
            System.out.println("Введите координаты хода: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }while (!isCellValid(x, y));
        System.out.println("Вы ввели " + (x + 1) + " " + (y+1));
        map[y][x] = O_FIELD;
        getField();


    }

    public static void xTurn(){
        int x, y;
        do {
            System.out.println("Ход X: ");
            System.out.println("Введите координаты хода: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }while (!isCellValid(x, y));
        System.out.println("Вы ввели " + (x + 1) + " " + (y+1));
        map[y][x] = X_FIELD;
        getField();

    }
    public static void getField(){
        for (int i = 0; i < MAP_SIZE; i++) {
            System.out.print("[ ");
            for (int j = 0; j < MAP_SIZE; j++) {
                System.out.print("| '" + map[i][j] + "' " + "|");
            }
            System.out.println("] ");
        }
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
    
}
