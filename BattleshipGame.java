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

    /**
    
        1 2 3 4 5 6 7 8 9 
        2
        3     x x x x
        4
        5
        6         x x x x
        7
        8
        9

        1. Greedy heuristic approach. Sort ships from largest size to smallest size.

        random = (3, 4)
        random = (6, 6)
        random = (3, 2)
        
        boolean[][] = 
    
     */

    public void buildShips() {

        //we only initialize the ships here, the body is still null!
        ships[0] = new AircraftCarrier();
        ships[1] = new Battleship();
        ships[2] = new Cruiser();
        ships[3] = new Destroyer();
        ships[4] = new Destroyer();

    }

    public void placeRandomShips() {

        Random rand = new Random();

        for (Ship ship: this.ships) {

            while(ship.body[0] == null) {
                int randX = rand.nextInt(9);
                int randY = rand.nextInt(9);

                //check if randX randY is in range

                if(randX + ship.size < 10) {
                    //check if it overlaps with existing ship
                    for (int i = 0; i < ship.size; i++) {
                        if (!(Ship[randX + i][randY] == "-")) {
                            return false;
                        }
                    }
                }
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
