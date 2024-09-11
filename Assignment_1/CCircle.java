public class CCircle extends COval {
    private int radius;

    public CCircle(int radius) {
        super(radius, radius);  // Call COval constructor with the same radius, A Circle is a specific type of Oval with one radius value
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "CIRCLE " + radius;
    }

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
    
    // @Override
    // public int hashCode() {
    //     return this.radius;
    // } 
}
