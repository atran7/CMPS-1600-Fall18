import java.util.Scanner;

public class myLong
{
    int [] intToLong = new int [100];
    int [] array = new int [100];

    private String aLong;
    private int strlen;

    public myLong ()
    {
        aLong = "";
        strlen = -1;
    }

    /*
        main() - This function sets the string input into an integer array with index of 100, so each integer gets its own index
     */

    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        String aLong = scnr.next();
        int[] intToLong = new int[100];
        for (int i = 0; i <aLong.length(); i++)
        {
            intToLong [i] = Character.getNumericValue(aLong.charAt(i));
        }

    }

    /*
        setLong() - This function gets the user input and puts that string into the integer array
     */

    public void setLong()
    {
        Scanner scnr = new Scanner(System.in);
        aLong = scnr.next();
        int strlen = aLong.length();
        for (int i = intToLong.length - 1; i > intToLong.length - strlen - 1; i--)
        {
            int x = aLong.length();
            intToLong[i] = Integer.parseInt(aLong.substring(x - 1));
            aLong = aLong.substring(0, x - 1);
        }

    }

    /*
        getLong() - This function returns the integer array
     */

    public  void getLong ()
    {
        int print;
        for (int x = 0; x < intToLong.length; x++)
        {
            if (intToLong[x] != 0)
            {
                print = x;
                for (int i = print; i < 100; i++)
                {
                    System.out.print(intToLong[i]);
                }
                break;
            }
        }

    }

    /*
        add(myLong a) - this function adds two instances of myLong together
     */

   public int[] add(myLong a)
    {
        int [] A = a.intToLong;
        int [] This = this.intToLong;

        for (int x = intToLong.length-1; x > 0; x--)
        {
            array[x] = This[x] + A[x];
        }

        for (int y = intToLong.length-1; y > 0; y--)
        {
            if (array[y] >= 10)
            {
                array[y] = array[y] % 10;
                array[y-1] = array[y - 1] + 1;
            }
        }

        return array;
    }

    /*
        subtract (myLong a) - this function subtracts two instances of myLong only if myLong a is smaller than This.
        If a is larger, then an error message is returned
     */

    public int [] subtract (myLong a)
    {
        int [] A = a.intToLong;
        int [] This = this.intToLong;
        int digitT = 0;
        int digitA = 0;
        int [] difference = new int[100];

        for (int x = 0; x < A.length; x++)
        {
            if (A[x] != 0)
            {
                digitA = x;
                break;
            }
        }

        for (int x = 0; x < This.length; x++)
        {
            if (This[x] != 0)
            {
                digitT = x;
                break;
            }
        }

        if (digitA < digitT)
        {
            System.out.print("Error");
            return difference;
        }
        else if (digitA == digitT && This[digitT] < A[digitA])
        {
            System.out.print("Error");
            return difference;
        }

        for (int i = 99; i>0; i--)
        {
            if (This[i] - A[i] >= 0)
            {
                difference[i] = This[i] - A[i];
            }

            else
                {
                    difference[i] = (10+This[i]) - A[i];
                    difference[i-1] = This[i-1]--;
                }

        }
        for (int i = 0; i<100; i++)
        {
            System.out.print(difference[i]);
        }
        return difference;
    }

    /*
        multiply (myLong a) - this function multiplies two instances of myLong together

        ONLY WORKS UP UNTIL THE PRODUCT EQUALS 9 FOR NOW
     */

    public int [] multiply (myLong a)
    {
        int [] A = a.intToLong;
        int [] This = this.intToLong;

        int[] product = new int [100];

        int carry = 0;

        int multiply;


        for (int i = This.length-1; i > 0; i--)
        {
            multiply = A[i] * This[i];

            if (multiply >=10)
            {
                carry = multiply %10;
                product [i] = multiply/10;
                product[i] = A[i] * This[i]+carry;
            }
            else
            {
                product[i] = multiply;
            }

        }
        
        /*
            My carry function does not work as planned, and what I originally tried to do was to have a nested loop that stayed at
            one value of A, then iterated through This to multiply that A value by This. Then I would increment the place of A to 
            get to the next value and multiply, but also add a 0 to that value in accordance with the rules of multiplication, and 
            so forth. But when I tried, I only returned an array of 0s, so at least this way, some value is returned, even if not totally
            correct.
        */

        for (int i = 0; i<100; i++)
        {
            System.out.print(product[i]);
        }

        return product;
    }
}
