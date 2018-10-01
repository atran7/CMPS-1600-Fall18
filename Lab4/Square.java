/**
 * Makes squares of the specified parameters of height and length
 */
public class Square extends Rectangle
{
    /**
     * The constructor makes the square and increments shapeCount to keep track of how many shapes are made
     *
     * @param l the length of the square
     * @param h the height of the square; should be the same length as the length
     */
    public Square(double l, double h)
    {
        super(l, h);
        length = l;
        height = h;
        shapeCount++;
    }

    /**
     * area computes the area for the square
     *
     * @return double area value
     */
    public double area()
    {
        return (length*length);
    }

    /**
     * perimeter computes the perimeter for the square
     *
     * @return double perimeter value
     */
    public double perimeter()
    {
        return (4*length);
    }


    /**
     * getShape gives the name of the shape
     *
     * @return declaration of shape type
     */
    public String getShape()
    {
        return "Square";
    }
}
