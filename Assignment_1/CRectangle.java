public class CRectangle extends CShape {
    private int length;
    private int width;

    public CRectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;  // Area of a rectangle
    }

    @Override
    public String toString() {
        return "RECTANGLE " + length + "x" + width;
    }
}
