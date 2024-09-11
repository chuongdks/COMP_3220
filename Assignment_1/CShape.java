public abstract class CShape {
    private static int counter = 0;  // Static counter for unique IDs
    private final int id;  // Unique ID for each shape

    public CShape() {
        counter++;  // Increment counter everytime a Shape object is generated
        this.id = counter; // Each Shape has an ID
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
