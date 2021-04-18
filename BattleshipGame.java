import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class BattleshipGame {

    public int row = 10;
    public int col = 10;
    public Ship[] ships;

    public BattleshipGame() {
        //intialize your ship array
        ships = new Ship[5];

        //add in ship objects
        buildShips();

    }

    public void buildShips() {
        ships[0] = new AircraftCarrier();
        
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


    //initializes the board with "-"
    public static String[][] createEmptyBoard(String[][] board) {

        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = "-";
            }
        }
        return board;
    }

    public static void printBoard(String[][] board) {

    }
}
