import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// Canvas "has-a" Shape, based on SeatReservation.java file
public class CCanvas {
    // Arraylist for Canvas based on the "CShape" Class
    private ArrayList<CShape> shapes; // An ArrayList of type CShape, Has-a relationship

    // Constructor of CCanvas to add an ArrayList of "Shape" Class
    public CCanvas() {
        shapes = new ArrayList<CShape>();
        generateTenShapes(); // Create 10 random shapes on instantiation in main
    }


}
