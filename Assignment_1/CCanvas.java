import java.util.ArrayList;
import java.util.Random;

// Canvas "has-a" Shape, based on SeatReservation.java file
public class CCanvas {
    // Arraylist for Canvas based on the "CShape" Class
    private ArrayList<CShape> shapes; // An ArrayList of type CShape, Has-a relationship

    // Constructor of CCanvas to add an ArrayList of "Shape" Class
    public CCanvas() {
        shapes = new ArrayList<CShape>();
        generateTenShapes(); // Create 10 random shapes on instantiation in main
    }

    /**
     * Generates a list of 10 random non-duplicate shapes with valid dimensions.
     */
    public void generateTenShapes() 
    {
        Random rand = new Random();

        while (shapes.size() < 10) 
        {
            int shapeType = rand.nextInt(4); // 0: Oval, 1: Circle, 2: Rectangle, 3: Square
            CShape shape = null;

            switch (shapeType) 
            {
                case 0: // Oval
                    int horizontalRadius = rand.nextInt(101);
                    int verticalRadius = rand.nextInt(101);
                    shape = new COval(horizontalRadius, verticalRadius);
                    break;
                    
                case 1: // Circle
                    int radius = rand.nextInt(101);
                    shape = new CCircle(radius);
                    break;

                case 2: // Rectangle
                    int length = rand.nextInt(101);
                    int width = rand.nextInt(101);
                    shape = new CRectangle(length, width);                
                    break;

                case 3: // Square
                    int side = rand.nextInt(101);
                    shape = new CSquare(side);
                    break;
            }

            if (shape != null && !shapes.contains(shape)) 
            {
                shapes.add(shape); // Add non-duplicate shape
            }
        }
    }

    /**
     * Calculates the total area of all shapes on the canvas.
     * 
     * @return the total area of all shapes.
     */
    public double getTotalArea() 
    {
        double totalArea = 0;
        for (CShape shape : shapes) 
        {
            totalArea += shape.getArea();
        }
        return totalArea;
    }

    /**
     * Prints the details of all shapes on the canvas.
     */
    public void displayCanvas() 
    {
        System.out.println("Canvas has the following random shapes:");
        for (CShape shape : shapes) 
        {
            System.out.println("Shape " + shape.getId() + ": " + shape.toString());
        }
        System.out.printf("Total area of all shapes is: %.2f\n", getTotalArea());
    }
}
