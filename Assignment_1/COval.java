/**
 * COval class has a horizontal radius and a vertical radius. An Oval "is-a" Shape
 * 
 * @author Chuong Pham
 * @since 2024-9-12
 */
public class COval extends CShape {
    /**
     * horizontalRadius for the Oval shape
     */    
    private int horizontalRadius;
    /**
     * verticalRadius for the Oval shape
     */        
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

    /**
     * Override equals method to use the contains method to check for duplicate
     * 
     * @see <a href="https://stackoverflow.com/questions/16273310/check-if-an-arraylist-contains-a-given-object">Reference Link</a>
     */        
    @Override
    public boolean equals(Object object)
    {
        boolean isEqual= false;
    
        if (object != null && object instanceof COval)
        {
            isEqual = (this.horizontalRadius == ((COval) object).horizontalRadius);
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
        return this.horizontalRadius;
    }    
}
