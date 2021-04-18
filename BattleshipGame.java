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

        createEmptyBoard(board);

        intiialize();
        
    }

    public void initialize() {
        this.shotsFired = 0;
        this.hitsRecorded = 0;
        this.shipsSunk = 0;
        totalShips = 0;

        buildShips();
        placeRandomShips();
    }

    public void buildShips() {
        ships = new ArrayList<>();
        ships.add(new AircraftCarrier());
        ships.add(new Battleships());
        ships.add(new Cruiser());
        ships.add(new Destroyer());
        ships.add(new Destroyer());
    }

    public static void placeRandomShips() {

        //ship coordinate
        Random random = new Random();

        if (0 <= randomX + shipNumber < 10) {
            for (i = 0; i < ships.length; i++);
                while (canPlaceShip(randX, randY, board) == true) {
                    int randX = random.nextInt(10);
                    int randY = random.nextInt(10);
                    board[randX + i][randY]
            }
        }


    }

    public static boolean canPlaceShip(int row, int col, String[][] board) {

        if (!(board[row][col] == "-")) {
            return false;
        }

        //horizontal
        for (int i = 1; i < getShipSize(); i++) {
            if (!(board[row][col + i] == "-")) {
                return false;
            }
        }

        return true;
    }


    public static String[][] createEmptyBoard(String[][] board) {

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

    

}
