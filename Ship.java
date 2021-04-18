public class Ship {
    int size;
    String letter; 
    ShipBody[] body;

    /**
        3 4 5 6
     3  x x x x

        size = 4
        letter = A
        body = null

        initializeBody(3, 3);
        


     */

    public void initializeBody(int x, int y) {
        for(int i = x; i < x + size; i++) {
            body[i-x] = new ShipBody(i, y);
        }
    }

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