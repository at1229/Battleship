import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class BattleshipGame {

    static int row = 10;
    static int col = 10;
    public static String[][] board = new String[row][col];
    public static String[][] playerBoard = new String[row][col];
    
    public static void main(String[] args) {
        
        System.out.println("Welcome to Battleship game");
        System.out.println("The ships have been randomly placed");

        createBoard(board);
        
    }

    public static String[][] createBoard(String[][] board) {

        System.out.println("  ");
        System.out.println("  0 1 2 3 4 5 6 7 8 9");

        for(int i = 0; i < row; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < col; j++) {
                board[i][j] = "-";
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
        return board;
    }

    public static void placeShips(String[][] board) {
        yes yes
        
        


    }


}