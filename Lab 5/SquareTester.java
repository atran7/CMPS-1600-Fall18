import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This SquareTester will test for the functionality of the Square class
 *
 * @author Aline Tran
 * @version 1.0
 */

public class SquareTester extends TestCase {
    private Square s1;
    private Square s2;
    private Square s3;

    @Before
    public void setUp() {
        s1 = new Square(1,1);
        s2 = new Square(3.0,3.0);
        s3 = new Square (3,3);
    }

    /**
     * Makes sure that the side lengths are as specified
     */
    @Test
    public void testSide(){
        assert s1.getLength() == 1.0;
        assert s2.getLength() == 3.0;
        assert s3.getLength() == 3.0;
    }

    /**
     * Tests area method for Square class
     */
    @Test
    public void testArea(){
        assert s1.area() == 1;
        assert s2.area() == 9;
        assert s3.area() == 9;
    }

    /**
     * Tests the perimeter method of Square class
     */
    @Test
    public void testPerimeter(){
        assert s1.perimeter() == 4;
        assert s2.perimeter() == 12;
        assert s3.perimeter() == 12;
    }

    /**
     * Tests the equals method of the Square class
     */
    @Test
    public void testEquals()
    {
        assert s1.equals(s2) == false;
        assert s2.equals(s3) == true;
    }

    /**
     * Tests the toString method of the Square class
     */
    @Test
    public void testtoString()
    {
        assert s1.toString().equals("This square is has sides of" + s1.getHeight() + " units with a perimeter of " + s1.perimeter() + " units and an area of " + s1.area() + " units.");
        assert s2.toString().equals("This square is has sides of" + s2.getHeight() + " units with a perimeter of " + s2.perimeter() + " units and an area of " + s2.area() + " units.");
        assert s3.toString().equals("This square is has sides of" + s3.getHeight() + " units with a perimeter of " + s3.perimeter() + " units and an area of " + s3.area() + " units.");
    }
    @After
    public void tearDown()  {
        s1 = null;
        s2 = null;
        s3 = null;
    }

}