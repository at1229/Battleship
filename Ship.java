public class Ship {
    int size;
    String letter; 
    ShipBody[] body;

    /**
        1 2 3 4
     1  x x x o

        size = 4
        letter = A
        body = (1, 1, false), (1, 2, false), (1, 3, false), (1, 4, true)
        


     */

    public void hit(int x, int y) {
        for (ShipBody cell: body) {
            if(x == cell.x && y == cell.y) {
                cell.isHit = true;
            }
        }
    }

    public boolean isSunk() {
        int counter = 0;
        for (ShipBody cell: body) {
            if(cell.isHit) {
                //ok it is hit!
                counter++;
            }
        }
        return counter == this.size;
    }
}