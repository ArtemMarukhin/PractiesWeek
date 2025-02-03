package week1.week11;

public class TicTacToe {
    public static void main(String[] args) {

    }

    String[][] field;
    String nowPlayer;
    public ticTacToe(){
        newGame();

    }

    void newGame(){
        field = new String[][] {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        nowPlayer = "X";
    }

    String[][] getField(){
        return field;
    }

    void checkGame(){

    }

    void makeMove(int x, int y){

    }
}
