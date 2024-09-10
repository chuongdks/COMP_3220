public class COval extends CShape {
    private int horizontalRadius;
    private int verticalRadius;

    public COval(int horizontalRadius, int verticalRadius) {
        this.horizontalRadius = horizontalRadius;
        this.verticalRadius = verticalRadius;
    }

    @Override
    public double getArea() {
        return Math.PI * horizontalRadius * verticalRadius;  // Area of an oval
    }

    @Override
    public String toString() {
        return "OVAL " + horizontalRadius + "x" + verticalRadius;
    }
}
