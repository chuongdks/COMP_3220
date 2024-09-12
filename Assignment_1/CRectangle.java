/**
 * CRectangle is a Shape with a value for length and width
 * 
 * @author Chuong Pham
 * @since 2024-9-12
 */
public class CRectangle extends CShape {
    /**
     * length for the Rectangle shape
     */           
    private int length;
    /**
     * width for the Rectangle shape
     */           
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

    /**
     * Override equals method to use the contains method to check for duplicate
     * 
     * @see <a href="https://stackoverflow.com/questions/16273310/check-if-an-arraylist-contains-a-given-object">Reference Link</a>
     */  
    @Override
    public boolean equals(Object object)
    {
        boolean isEqual= false;
    
        if (object != null && object instanceof CRectangle)
        {
            isEqual = (this.length == ((CRectangle) object).length);
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
        return this.length;
    }   
}
