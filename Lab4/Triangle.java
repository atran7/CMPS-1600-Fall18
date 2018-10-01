/**
 * Makes triangles of the specified parameters of height and length
 */
public class Triangle extends Shape
{

    private double side1;
    private double side2;
    private double side3;

    /**
     * The constructor makes the triangle and increments shapeCount to keep track of how many shapes are made
     *
     * @param s1 he length of the first side of the triangle
     * @param s2 he length of the second side of the triangle
     * @param s3 the length of the third side of the triangle
     */
    public Triangle(double s1, double s2, double s3)
    {
        side1 = s1;
        side2 = s2;
        side3 = s3;
        shapeCount ++;
    }

    /**
     * area computes the area for the triangle
     *
     * @return double area value
     */
    double area()
    {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * perimeter computes the perimeter for the triangle
     *
     * @return double perimeter value
     */
    public double perimeter()
    {
        return side1+side2+side3;
    }


    /**
     * getShape gives the name of the shape
     *
     * @return declaration of shape type
     */
    public String getShape()
    {
        return "Triangle";
    }
}
