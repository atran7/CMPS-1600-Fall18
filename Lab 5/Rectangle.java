public class Rectangle
{
    double length;
    double height;
    private static int counter = -1;

    public Rectangle(double l, double h)
    {
        length = l;
        height = h;
        counter++;

    }

    public void setLength(double l)
    {
        length = l;
    }

    public void setHeight (double h)
    {
        height = h;
    }

    public double getHeight()
    {
        return height;
    }

    public double getLength()
    {
        return length;
    }

    public double area ()
    {
        return (length*height);
    }

    public double perimeter ()
    {
        return ((2*length) + (2*height));
    }

    public int getRectangleID()
    {
        return counter;
    }

    @Override
    public String toString()
    {
        return "This rectangle is " + this.getHeight() + " units tall and " + this.getLength() +  " units long with a perimeter of " + this.perimeter() + " units and an area of " + this.area() + " units.";
    }


}