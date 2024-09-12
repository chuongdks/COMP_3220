/**
 * CSquare is a Rectangle with the same 4 sides
 * 
 * @author Chuong Pham
 * @since 2024-9-12
 */
public class CSquare extends CRectangle {
    /**
     * side of the Square shape
     */       
    private int side;

    public CSquare(int side) {
        super(side, side);  // Call CRectangle constructor with the same side length
        this.side = side;
    }

    @Override
    public String toString() {
        return "SQUARE " + side + "x" + side;
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
    
        if (object != null && object instanceof CSquare)
        {
            isEqual = (this.side == ((CSquare) object).side);
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
        return this.side;
    }      
}
