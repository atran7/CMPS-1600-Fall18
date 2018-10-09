public class Square extends Rectangle
{
    public Square(double l, double h)
    {
        super(l, h);
        length = l;
        height = h;
    }

    /**
     * @param l - setLength will get the double input and make that the length of the square
     */
    @Override
    public void setLength(double l)
    {
        length = l;
    }

    @Override
    public void setHeight (double h)
    {
        height = h;
    }

    /**
     * @return - toString will return a string with the dimensions of the square
     */
    @Override
    public String toString()
    {
        return "This square is has sides of" + this.getHeight() + " units with a perimeter of " + this.perimeter() + " units and an area of " + this.area() + " units.";
    }

    @Override
    public boolean equals (Object obj)
    {
        Square s = (Square) obj;
        if (s instanceof Square)
        {
            if (this.getHeight() == s.getHeight())
            {
                return true;
            }
        }
        return false;
    }
}
