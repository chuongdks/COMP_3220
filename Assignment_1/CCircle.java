/**
 * CCircle is a specific type of Oval with one radius value
 * 
 * @author Chuong Pham
 * @since 2024-9-12
 */
public class CCircle extends COval {
    /**
     * radius for the Circle shape
     */       
    private int radius;

    public CCircle(int radius) {
        super(radius, radius);  // Call COval constructor with the same radius
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "CIRCLE " + radius;
    }

    /**
     * Override equals method to use the contains method to check for duplicate
     * 
     * @see <a href="https://stackoverflow.com/questions/16273310/check-if-an-arraylist-contains-a-given-object">Reference Link</a>
     */  
    @Override
    public boolean equals(Object object)
    {
        boolean isEqual= false;
    
        if (object != null && object instanceof CCircle)
        {
            isEqual = (this.radius == ((CCircle) object).radius);
        }
    
        return isEqual;
    }
    
    /**
     * Override hashCode method to use the contains method to check for duplicate
     * 
     * @see <a href="https://stackoverflow.com/questions/16273310/check-if-an-arraylist-contains-a-given-object">Reference Link</a>
     */       
    @Override
    public int hashCode() {
        return this.radius;
    } 
}
