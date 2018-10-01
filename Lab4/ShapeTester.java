import java.util.ArrayList;

import java.util.Collections;

/**
 * The ShapeTester class checks the methods of each of the subclasses of Shapes
 */
public class ShapeTester
{
    /**
     * The main method makes an arraylist of shapes and sorts them in ascending order of area
     *
     * @param args
     */
    public static void main (String[] args)
    {
        ArrayList<Shape> shape = new ArrayList<Shape>();
        shape.add(new Circle (2));
        shape.add(new Rectangle(3, 4));
        shape.add(new Triangle (3, 4, 5));
        shape.add(new Square (6,6));
        shape.add (new Circle (4.5));
        shape.add (new Circle (11));
        shape.add(new Triangle (10, 24, 26));
        shape.add (new Rectangle (3.5, 6));

        //prints out the order of the shapes in the array
        for (int i = 0; i<shape.size(); i++)
        {
            System.out.println(shape.get(i).getShape());
        }

        //prints only circles and their position in the array
        for (int i = 0; i<shape.size(); i++)
        {
            if (shape.get(i).getShape().equals("Circle"))
            {
                System.out.println (shape.get(i).getShape() + " at position " + i + " in the array");
            }
        }

        //returns the amount of shapes made
        System.out.println(Shape.shapeCount);

        displayArray(shape);

        Collections.sort(shape);

        System.out.println(shape);

    }


    /**
     * displayArray calls the display method from the abstract Shape class
     *
     * @param s
     */
    public static void displayArray (ArrayList<Shape> s)
    {
        for (int i = 0; i<s.size(); i++)
        {
            s.get(i).display();
        }
    }

}
