/**
 * Abstract class for each shapes with unique id
 * 
 * @author Chuong Pham
 * @since 2024-9-12
 */
public abstract class CShape {
    /**
     * Static counter for unique IDs
     */
    private static int counter = 0;  
    /**
     * Unique ID for each shape
     */    
    private final int id;  

    public CShape() {
        counter++;  // Increment counter everytime a Shape object is generated
        this.id = counter; // Each Shape has an ID
    }

    /**
     * Get the unique ID of the shape
     * 
     * @return unique ID of the shape.
     */
    public int getId() {
        return id;
    }

    /**
     * Calculate the area of the shape
     * 
     * @return area of the shape.
     */
    public abstract double getArea(); // It is an abstract method in Shape class

    /**
     * Describe the shape details    
     * 
     * @return string literal describing the Shapes and its dimension.
     */
    @Override
    public abstract String toString();  
}
