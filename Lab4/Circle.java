/**
 * Makes circles of the specified parameter of radius
 */
public class Circle extends Shape
{
    private double radius;
    private double pi;

    /**
     * The constructor makes the circle and increments shapeCount to keep track of how many shapes are made
     *
     * @param r the radius of the circle
     */
    public Circle(double r)
    {
        radius = r;
        pi = Math.PI;
        shapeCount ++;
    }

    /**
     * area computes the area for the circle
     *
     * @return double area value
     */
    public double area()
    {
        double area = this.radius * this.radius * pi;
        return area;
    }

    /**
     * perimeter computes the perimeter for the circle
     *
     * @return double perimeter value
     */
    public double perimeter()
    {
        double perimeter = 2*this.radius*pi;
        return perimeter;
    }

    /**
     * getShape gives the name of the shape
     *
     * @return declaration of shape type
     */
    public String getShape()
    {
        return "Circle";
    }
}
