/**
 * Makes rectangles of the specified parameters of height and length
 */
public class Rectangle extends Shape
{

    double length;
    double height;

    /**
     * The constructor makes the rectangle and increments shapeCount to keep track of how many shapes are made
     *
     * @param l which is the length
     * @param h which is the height
     */
    public Rectangle(double l, double h)
    {
        length = l;
        height = h;
        shapeCount++;
    }

    /**
     * area computes the area for the rectangle
     *
     * @return double area value
     */
    public double area()
    {
        return (length*height);
    }

    /**
     * perimeter computes the perimeter for the rectangle
     *
     * @return double perimeter value
     */
    public double perimeter()
    {
        return (2*length) + (2*height);
    }


    /**
     * getShape gives the name of the shape
     *
     * @return declaration of shape type
     */
    public String getShape()
    {
        return "Rectangle";
    }
}
