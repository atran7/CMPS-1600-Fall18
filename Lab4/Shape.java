/**
 * This abstract class contains basic methods for all shapes
 *
 * @author Aline Tran
 * @version 1.0
 */
public abstract class Shape implements Displayable, Comparable<Shape>

{
    abstract double area();
    abstract double perimeter();
    abstract String getShape();
    static int shapeCount = -1;

    /**
     * Displays a readable version of the details of the shape
     *
     * @return void
     */
    public void display()
    {
        System.out.println(this.getShape() + " has an area of " + this.area() + " and a perimeter of " + this.perimeter());
    }

    /**
     * This compares the areas of two shapes and returns and integer value accordingly
     *
     * @param  s the Shape the object is being compared to
     * @return int
     */
    @Override
    public int compareTo(Shape s)
    {
        int compare = 0;
        if (this.area() < s.area())
        {
            compare = -1;
        }
        else if (this.area () > s.area())
        {
            compare = 1;
        }

        return compare;
    }
}
