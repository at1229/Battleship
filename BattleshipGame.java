import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class BattleshipGame {

    static int row = 10;
    static int col = 10;
    public static String[][] board = new String[row][col];
    public static String[][] playerBoard = new String[row][col];

    AircraftCarrier aircraft = new AircraftCarrier();
    Battleships battleship = new Battleships();
    Cruiser cruiser = new Cruiser();
    Destroyer destroyer = new Destroyer();
    
    public static void main(String[] args) {
        
        System.out.println("Welcome to Battleship game");
        System.out.println("The ships have been randomly placed");

        createEmptyBoard(board);

        placeShips(board);
        
    }

    public void initialize() {
        this.shotsFired = 0;
        this.hitsRecorded = 0;
        this.shipsSunk = 0;
        totalShips = 0;

        playerBoard();
        buildShips();
    }

    public void buildShips() {
        ships = new ArrayList<>();
        ships.add(new AircraftCarrier());
        ships.add(new Battleships());
        ships.add(new Cruiser());
        ships.add(new Destroyer());
        ships.add(new Destroyer());
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

    public static void placeRandomShips(String[][] board) {

        Random rand = new Random();
        int randX;
        int randY;



    }
