package week1.week11;

import java.util.Scanner;

public class TicTacToe {
    static Scanner scanner;
    static char [][] map;
    static final int MAP_SIZE = 3;
    static final char EMPTY_FIELD = '-';
    static final char X_FIELD = 'X';
    static final char O_FIELD = 'O';
    static boolean turn = true;
    static boolean endGame = false;

    public static void main(String[] args) {
        newGame();
        printMap();
        startGame();
    }


    public static boolean checkWin(char playerField){
//        if (map[0][0] == playerField && map[0][1] == playerField && map[0][2] == playerField)            return true;
//        if (map[1][0] == playerField && map[1][1] == playerField && map[1][2] == playerField)            return true;
//        if (map[2][0] == playerField && map[2][1] == playerField && map[2][2] == playerField)            return true;
//
//        if (map[0][0] == playerField && map[1][0] == playerField && map[2][0] == playerField)            return true;
//        if (map[0][1] == playerField && map[1][1] == playerField && map[2][1] == playerField)            return true;
//        if (map[0][2] == playerField && map[1][2] == playerField && map[2][2] == playerField)            return true;
//
//        if (map[0][0] == playerField && map[1][1] == playerField && map[2][2] == playerField)            return true;
//        if (map[0][2] == playerField && map[1][1] == playerField && map[2][0] == playerField)            return true;

        for (int i = 0; i < MAP_SIZE; i++) {
            boolean check = true;
            for (int j = 0; j < MAP_SIZE; j++) {
                if (map[i][j] == playerField || map[i][j] == EMPTY_FIELD) check = false;
            }
            if (check) return true;
        }

        for (int i = 0; i < 3; i++) {
            boolean check = true;
            for (int j = 0; j < 3; j++) {
                if (map[j][i] == playerField || map[j][i] == EMPTY_FIELD) check = false;
            }
            if (check) return true;
        }

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
                if (map[i][j] == EMPTY_FIELD){
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
        if(map[y][x] != EMPTY_FIELD){
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
        printMap();


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
        printMap();

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

    public static void newGame (){
        map = new char[MAP_SIZE][MAP_SIZE];
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                map[i][j] = EMPTY_FIELD;
            }
        }
        scanner = new Scanner(System.in);
    }
    
}
