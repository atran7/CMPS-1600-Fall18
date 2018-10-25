import java.util.ArrayList;

public class myLong {


    ArrayList<Integer> intToLong = new ArrayList<Integer>();

    private int strlen;
    private String aLong;

    public myLong()
    {
        aLong = "";
        strlen = -1;
    }

    /*
        setLong() - This function gets the user input and puts that string into the integer array
     */

    public String setLong(String s)
    {
        strlen = s.length();
        for (int i = 0; i < strlen; i++) {

            if (Character.toString(s.charAt(i)).equals('-'))
            {
                aLong = aLong + "-";
            }

            else
            {
                Integer x = Character.getNumericValue(s.charAt(i));
                intToLong.add(x);
            }
        }

        for (int x = 0; x < intToLong.size(); x++)
        {
            aLong = aLong + Integer.toString(x);
        }


        return aLong;
    }

    public String toString()
    {
        ArrayList <Integer> This = this.intToLong;
        String b = "";
        String negative = "";

        for (int x = 0; x < This.size(); x++)
        {
            if (This.get(x).equals(-1))
            {
                b = b + "-";
            }
            else {
                b = b + Integer.toString(This.get(x));
                negative = negative + Integer.toString(This.get(x));
            }

            for (int i = 1; i<b.length()-1; i++)
            {
                if ((Character.toString(b.charAt(i)).equals("0") && Character.toString(b.charAt(i-1)).equals("0") ))
                {
                    b = b.substring(1);
                }
            }


        }

        if (Character.toString(b.charAt(0)).equals("0"))
        {
            b = b.substring(1);
        }

        if (Integer.toString(This.get(0)).equals("-1") && Integer.toString(This.get(1)).equals("0"))
        {
            b = "-" + b;
        }

        return b;
    }

    public myLong add(myLong a)
    {
        ArrayList <Integer > A = a.intToLong;
        ArrayList <Integer> This = this.intToLong;
        ArrayList<Integer> array = new ArrayList<Integer>();

        if (A.size() < This.size())
        {
            while (A.size () != This.size())
            {
                A.add(0,0);
            }
        }
        else
        {
            while (This.size () != A.size())
            {
                This.add(0,0);
            }
        }

        for (int x = 0; x < This.size(); x++)
        {
            array.add(This.get(x) + A.get(x));
        }

        for (int y = array.size()-1; y > 0; y--)
        {
            if (array.get(y) >= 10)
            {
                array.set(y,array.get(y) % 10);
                array.set(y-1, array.get(y-1)+1);
            }
        }


        String b = "";
        for (int x = 0; x < array.size(); x++)
        {
            b = b + Integer.toString(array.get(x));
        }

        myLong sum = new myLong();
        sum.setLong(b);

        return sum;
    }

    public myLong subtract (myLong a)
    {
        ArrayList <Integer > A = a.intToLong;
        ArrayList <Integer> This = this.intToLong;
        ArrayList<Integer> array = new ArrayList<Integer>();
        String d = "";
        ArrayList<Integer> max = new ArrayList <Integer>();
        ArrayList<Integer> min = new ArrayList <Integer>();
        Long z;
        Long y;

        if (A.size() == This.size())
        {
            String c = "";
            for (int x = 0; x < A.size(); x++)
            {
                c = c + Integer.toString(A.get(x));
            }


            z = Long.parseLong(c);

            String b = "";
            for (int r = 0; r < This.size(); r++)
            {
                b = b + Integer.toString(This.get(r));
            }

            y = Long.parseLong(b);

            if (z > y)
            {
                max.addAll(A);
                min.addAll(This);
                d = "-" + d;
            }
            else
            {
                max.addAll(This);
                min.addAll(A);
            }

        }

        else if (A.size () < This.size())
        {
            while (A.size () != This.size())
            {
                A.add(0,0);
            }
            max.addAll(This);
            min.addAll(A);
        }

        else
        {
            while (This.size () != A.size())
            {
                This.add(0,0);
            }
            max.addAll(A);
            min.addAll(This);
            d = "-" + d;
        }

        for (int x = max.size()-1; x >= 0; x--)
        {
            if (max.get(x) - min.get(x) < 0)
            {
                array.add(0,(10+max.get(x)) - min.get(x));
                if (max.get(x-1) == 0)
                {
                    max.set(x-2,max.get(x-2)-1);
                    max.set(x-1, 9);
                }
                else
                {
                    max.set(x - 1, max.get(x - 1) - 1);
                }
            }

            else
            {
                array.add(0,max.get(x)-min.get(x));
            }
        }


        for (int x = 0; x < array.size(); x++)
        {
            d = d + Integer.toString(array.get(x));
        }

        myLong difference = new myLong();
        difference.setLong(d);

        return difference;
    }

    public myLong multiply(myLong a)
    {
        ArrayList <Integer> This = this.intToLong;
        myLong aValue = a;

        Long y;
        int l = 1;
        String d = "";

        String b = "";

        for (int r = 0; r < This.size(); r++)
        {
            b = b + Integer.toString(This.get(r));
        }
        y = Long.parseLong(b);


        while (l != y)
        {
            a = a.add(aValue);
            l++;
        }

        ArrayList <Integer > A = a.intToLong;

        for (int x = 0; x < A.size(); x++)
        {
            d = d + Integer.toString(A.get(x));
        }

        myLong product = new myLong();
        product.setLong(d);
        return product;

    }

}