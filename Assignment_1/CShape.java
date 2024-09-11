public abstract class CShape {
    public static int id = 0;  // Static counter for unique IDs

    public CShape() {
        id++; // id counter increase everytime CShape object is created
    }

    /**
     * Get the unique ID of the shape.
     * @return unique ID of the shape.
     */
    public int getId() {
        return id;
    }

    /**
     * Calculate the area of the shape.
     * @return area of the shape.
     */
    public abstract double getArea(); // It is an abstract method in Shape class

    @Override
    public abstract String toString();  // Abstract method to get shape details
}
