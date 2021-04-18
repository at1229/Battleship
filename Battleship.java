public class Battleship extends Ship{
    public Battleship() {
        this.size = 4;
        this.letter = "B"; 
        this.body = new ShipBody[this.size];
    }
}
