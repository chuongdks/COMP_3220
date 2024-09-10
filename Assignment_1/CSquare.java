public class CSquare extends CRectangle {
    private int side;

    public CSquare(int side) {
        super(side, side);  // Call CRectangle constructor with the same side length
        this.side = side;
    }

    @Override
    public String toString() {
        return "SQUARE " + side + "x" + side;
    }
}
