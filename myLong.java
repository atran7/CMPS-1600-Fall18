import java.util.Scanner;

public class myLong
{
    int [] intToLong = new int [100];
    int y = 0; //used for the getLong method to keep track of the indices with actual values in them, since I did not have access to aLong.length() for the for loop
    int [] array = new int [100];

    String aLong;
    int strlen;

    public myLong ()
    {
        aLong = "";
        strlen = -1;
    }

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

    public int [] multiply (myLong a)
    {
        int [] A = a.intToLong;
        int [] This = this.intToLong;

        int[] product = new int [100];
        int [] addproduct = new int [100];
        int carry = 0;

        int multiply = 1;

        for (int i = This.length-1; i > 0; i--)
        {
            for (int x = This.length-1; x > This.length-multiply; x--)
            {
                addproduct[i] = A[i] * This[x];
            }
        }

        for (int x = This.length-1; x > 0; x--)
        {
            if (product[x] >= 10)
            {
                carry = product[x] %10;
                product [x] = product[x]/10;
                product[x-1] = product[x-1]+carry;
            }
        }
        for (int i = 0; i<100; i++)
        {
            System.out.print(product[i]);
        }

        return product;
    }
}
