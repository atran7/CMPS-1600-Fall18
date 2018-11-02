import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Calculator extends JFrame {

    private JButton num1;
    private JButton num2;
    private JButton num3;
    private JButton num4;
    private JButton num5;
    private JButton num6;
    private JButton num7;
    private JButton num8;
    private JButton num9;
    private JButton num0;
    private JButton equal;
    private JButton add;
    private JButton subtract;
    private JButton multiply;
    private JButton opar;
    private JButton cpar;
    private JTextField txt;

    String display = "";

    ArrayList<Integer> intToLong = new ArrayList<Integer>();

    public Calculator() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 4));
        p1.add(num7 = new JButton("7"));
        p1.add(num8 = new JButton("8"));
        p1.add(num9 = new JButton("9"));
        p1.add(multiply = new JButton("*"));
        p1.add(num4 = new JButton("4"));
        p1.add(num5 = new JButton("5"));
        p1.add(num6 = new JButton("6"));
        p1.add(subtract = new JButton("-"));
        p1.add(num1 = new JButton("1"));
        p1.add(num2 = new JButton("2"));
        p1.add(num3 = new JButton("3"));
        p1.add(add = new JButton("+"));
        p1.add(num0 = new JButton("0"));
        p1.add(opar = new JButton("("));
        p1.add(cpar = new JButton (")"));
        p1.add(equal = new JButton("="));


        JPanel p2 = new JPanel();
        p2.setLayout(new GridBagLayout());
        p2.add(txt = new JTextField(20));
        txt.setHorizontalAlignment(JTextField.RIGHT);
        txt.setEditable(true);



        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2,1));
        p.add(p2);
        p.add(p1);

        add(p);

        num1.addActionListener(new ListenToOne());
        num2.addActionListener(new ListenToTwo());
        num3.addActionListener(new ListenToThree());
        num4.addActionListener(new ListenToFour());
        num5.addActionListener(new ListenToFive());
        num6.addActionListener(new ListenToSix());
        num7.addActionListener(new ListenToSeven());
        num8.addActionListener(new ListenToEight());
        num9.addActionListener(new ListenToNine());
        num0.addActionListener(new ListenToZero());

        opar.addActionListener(new ListenToOpar());
        cpar.addActionListener(new ListenToCpar());

        add.addActionListener(new ListenToAdd());
        subtract.addActionListener(new ListenToSubtract());
        multiply.addActionListener(new ListenToMultiply());
        equal.addActionListener(new ListenToEqual());
    }

    class ListenToOpar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "(");
        }
    }

    class ListenToCpar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + ")");
        }
    }

    class ListenToOne implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "1");
        }
    }

    class ListenToTwo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "2");
        }
    }

    class ListenToThree implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "3");
        }
    }

    class ListenToFour implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "4");
        }
    }

    class ListenToFive implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "5");
        }
    }

    class ListenToSix implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "6");
        }
    }

    class ListenToSeven implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "7");
        }
    }

    class ListenToEight implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "8");
        }
    }

    class ListenToNine implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "9");
        }
    }

    class ListenToZero implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "0");
        }
    }

    class ListenToAdd implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "+");
        }
    }

    class ListenToSubtract implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "-");
        }
    }

    class ListenToMultiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            display = txt.getText();
            txt.setText(display + "*");
        }
    }

    class ListenToEqual implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            txt.setText(isValidInput());
        }
    }

    public String isValidInput()
    {
        int ocount = 0; //count the number of open parenthesis
        int ccount = 0; //count the number of closed parenthesis
        display = txt.getText();
        myLong sub1 = new myLong();
        myLong sub2 = new myLong();
        myLong answer = new myLong();
        String ans = display;
        String anspar = "";
        int ansp = 0;
        String b = "";
        String c = "";
        ArrayList <Character> ops = new ArrayList <Character>();
        ops.add('+');
        ops.add('-');
        ops.add('*');

        for (int i = 0; i < display.length(); i++)
        {
            if (display.charAt(i) == '(')
            {
                ocount ++;
            }
            if (display.charAt(i) == ')')
            {
                ccount ++;
            }

            if (display.charAt(i) == '+' || display.charAt(i) == '-' || display.charAt(i)== '*')
            {
                if ((display.charAt(i+1) == '+' || display.charAt(i+1) == '-' || display.charAt(i+1)== '*'))
                {
                    ans = "Invalid Input";
                    return ans;
                }
            }

            if (display.charAt(i) == '(' && display.charAt(i+1) == ')')
            {
                ans = "Invalid Input";
                return ans;
            }

            if (i!= display.length()-1 & display.charAt(i) == ')' && display.charAt(i+1) == '(')
            {
                ans = "Invalid Input";
                return ans;
            }

        }

        if (ocount != ccount)
        {
            ans ="Invalid Input";
            return ans;
        }
        else //here's where the calculations start
        {
                while ((ans.contains ("(") | ans.contains(")")))
                {
                    if (ans.indexOf("(") == 0 & ans.indexOf(")") == ans.length()-1)
                    {
                       ans = ans.substring(1, ans.length()-1);
                       continue;
                    }

                    else if (ans.indexOf(")") == ans.length()-1)
                    {
                        anspar = ans.substring(ans.lastIndexOf("("));
                    }
                    else if (ans.lastIndexOf("(") == 0)
                    {
                        anspar = ans.substring(0,ans.indexOf(")")+1);
                    }
                    else
                    {
                        anspar = ans.substring(ans.lastIndexOf("("), ans.indexOf(')')+1);
                    }

                    if (anspar.contains("*"))
                    {
                        sub1.setLong(anspar.substring(1,anspar.indexOf("*")));
                        sub2.setLong(anspar.substring(anspar.indexOf("*")+1));
                        answer = sub1.multiply(sub2);
                        String d = answer.toString();

                        if (anspar.equals(ans.substring(1,ans.length()-2)) | anspar.equals(ans)) //the case where there is one operation in parenthesis
                        {
                            ans = d;
                        }

                        else
                        {
                            ansp = ans.indexOf(anspar);

                            if (ansp == 0)
                            {
                                ans = d + ans.substring(ans.indexOf(')')+1);
                            }

                            else if (ansp + anspar.length() == ans.length())
                            {
                                ans = ans.substring(0,ansp-1) + d;
                            }

                            else
                            {
                                ans = ans.substring(0,ansp-1) + d + (ans.substring(ansp+anspar.length()+1));
                            }
                        }

                    }

                    if (anspar.contains("+"))
                    {
                        sub1.setLong(anspar.substring(1,anspar.indexOf("+")));
                        sub2.setLong(anspar.substring(anspar.indexOf("+")+1));
                        answer = sub1.add(sub2);
                        String d = answer.toString();


                        if (anspar.equals(ans.substring(1,ans.length()-2)) | anspar.equals(ans)) //the case where there is one operation in parenthesis
                        {
                            ans = d;
                        }

                        else
                        {
                            ansp = ans.indexOf(anspar);

                            if (ansp == 0)
                            {
                                ans = d + ans.substring(ans.indexOf(')')+1);
                            }

                            else if (ansp + anspar.length() == ans.length())
                            {
                                ans = ans.substring(0,ansp-1) + d;
                            }

                            else
                            {
                                ans = ans.substring(0,ansp-1) + d + (ans.substring(ansp+anspar.length()+1));
                            }
                        }

                    }

                    else if (anspar.contains("-"))
                    {
                        sub1.setLong(anspar.substring(1,anspar.indexOf("-")));
                        sub2.setLong(anspar.substring(anspar.indexOf("-")+1));
                        answer = sub1.subtract(sub2);
                        String d = answer.toString();

                        if (anspar.equals(ans.substring(1,ans.length()-2)) | anspar.equals(ans)) //the case where there is one operation in parenthesis
                        {
                            ans = d;
                        }

                        else
                        {
                            ansp = ans.indexOf(anspar);

                            if (ansp == 0)
                            {
                                ans = d + ans.substring(ans.indexOf(')')+1);
                            }

                            else if (ansp + anspar.length() == ans.length())
                            {
                                ans = ans.substring(0,ansp-1) + d;
                            }

                            else
                            {
                                ans = ans.substring(0,ansp-1) + d + (ans.substring(ansp+anspar.length()+1));
                            }
                        }

                    }
                }


            while (ans.contains ("*") | ans.contains("+") | ans.contains("-")) //loop for statements without parenthesis
            {
                while (ans.contains("*"))
                {
                    int index = ans.indexOf("*")-1;
                    int index2 = ans.indexOf("*") +1;

                    if (ans.contains("+"))
                    {
                        if (ans.indexOf("+") < index) //if addition before multiplication
                        {
                            while (ans.charAt(index) != '+')
                            {
                                b = ans.charAt(index) + b;
                                index --;
                            }

                            while (index2 != ans.length() && !ops.contains(ans.charAt(index2)))// this is to stop adding to the string once the number stops
                            {
                                c = c + ans.charAt(index2);
                                index2 ++;
                            }

                            sub1.setLong(b);
                            sub2.setLong(c);
                            answer = sub1.multiply(sub2);
                            String d = answer.toString();

                            if (index2 == ans.length())
                            {
                                ans = ans.substring(0,index+1) + d;
                            }

                            else
                            {
                                ans = ans.substring(0,index+1) + d + ans.substring(index2);
                            }

                        }

                        else if (ans.indexOf("+") > index2) // if addition after multiplication
                        {
                            while (index >= 0 && !ops.contains(ans.charAt(index)))
                            {
                                b = ans.charAt(index) + b;
                                index --;
                            }
                            while (ans.charAt(index2) != '+')
                            {
                                c = c + ans.charAt(index2);
                                index2 ++;
                            }

                            sub1.setLong(b);
                            sub2.setLong(c);
                            answer = sub1.multiply(sub2);
                            String d = answer.toString();


                            if (index == -1)
                            {
                                ans = d + ans.substring(index2);
                            }

                            else
                            {
                                ans = ans.substring(0,index) + d + ans.substring(index2);
                            }

                        }
                    }

                    else if (ans.contains("-"))
                    {
                        if (ans.indexOf("-") < index) // if subtraction before multiplication
                    {
                        while (ans.charAt(index) != '-')
                        {
                            b = ans.charAt(index) + b;
                            index --;
                        }

                        while (index2 != ans.length() && !ops.contains(ans.charAt(index2)))// this is to stop adding to the string once the number stops
                        {
                            c = c + ans.charAt(index2);
                            index2 ++;
                        }

                        sub1.setLong(b);
                        sub2.setLong(c);
                        answer = sub1.multiply(sub2);
                        String d = answer.toString();

                        if (index2 == ans.length())
                        {
                            ans = ans.substring(0,index+1) + d;
                        }

                        else
                        {
                            ans = ans.substring(0,index+1) + d + ans.substring(index2);
                        }

                    }

                        else if (ans.indexOf("-") > index2) // subtraction after multiplication
                        {
                            while (index >=0 && !ops.contains(ans.charAt(index)))
                            {
                                b = ans.charAt(index) + b;
                                index --;
                            }
                            while (ans.charAt(index2) != '-')
                            {
                                c = c + ans.charAt(index2);
                                index2 ++;
                            }

                            sub1.setLong(b);
                            sub2.setLong(c);
                            answer = sub1.multiply(sub2);
                            String d = answer.toString();

                            if (index == -1)
                            {
                                ans = d + ans.substring(index2);
                            }

                            else
                            {
                                ans = ans.substring(0,index+1) + d + ans.substring(index2);
                            }
                        }
                    }

                    else //if the function is purely multiplication
                    {
                        if (ans.lastIndexOf("*") == ans.indexOf("*"))  // this is if there is only 1 multiplication operation in the input
                        {
                            while (index >= 0)
                            {
                                b = ans.charAt(index) + b;
                                index --;
                            }

                            while (index2 <= ans.length()-1)
                            {
                                c = c + ans.charAt(index2);
                                index2 ++;
                            }

                            sub1.setLong(b);
                            sub2.setLong(c);
                            answer = sub1.multiply(sub2);
                            String d = answer.toString();

                            ans = d;
                        }

                        else //case with more than 1 multiplication operation
                        {
                            while (index >= 0)
                            {
                                b = ans.charAt(index) + b;
                                index --;
                            }

                            while (ans.charAt(index2) != '*')
                            {
                                c = c + ans.charAt(index2);
                                index2 ++;
                            }

                            sub1.setLong(b);
                            sub2.setLong(c);
                            answer = sub1.multiply(sub2);
                            String d = answer.toString();

                            ans = d + ans.substring(index2);
                        }
                    }

                }

                if (ans.contains ("+") & ans.contains("-"))
                {
                    if (ans.indexOf("+") < ans.indexOf("-")) //if addition before subtraction
                    {
                        int index = ans.indexOf("+")-1;
                        int index2 = ans.indexOf("+") +1;

                        while (index >= 0)
                        {
                            b = ans.charAt(index) + b;
                            index --;
                        }

                        while (index2 != ans.length() && !ops.contains(ans.charAt(index2)))// this is to stop adding to the string once the number stops
                        {
                            c = c + ans.charAt(index2);
                            index2 ++;
                        }

                        sub1.setLong(b);
                        sub2.setLong(c);
                        answer = sub1.add(sub2);
                        String d = answer.toString();

                        if (index2 == ans.length())
                        {
                            ans = d;
                        }

                        else
                        {
                            ans = d + ans.substring(index2);
                        }
                    }

                    if (ans.indexOf("+") > ans.indexOf("-")) //if subtraction before addition
                    {
                        int index = ans.indexOf("-")-1;
                        int index2 = ans.indexOf("-") +1;

                        while (index >=0)
                        {
                            b = ans.charAt(index) + b;
                            index --;
                        }

                        while (index2 != ans.length() && !ops.contains(ans.charAt(index2)))// this is to stop adding to the string once the number stops
                        {
                            c = c + ans.charAt(index2);
                            index2 ++;
                        }

                        sub1.setLong(b);
                        sub2.setLong(c);
                        answer = sub1.subtract(sub2);
                        String d = answer.toString();

                        if (index2 == ans.length())
                        {
                            ans = d;
                            continue;
                        }

                        else
                        {
                            ans = d + ans.substring(index2);
                        }
                    }
                }

                else if (ans.contains("+") & !ans.contains("-"))
                {
                    int index = ans.indexOf("+")-1;
                    int index2 = ans.indexOf("+") +1;

                    while (index >=0)
                    {
                        b = ans.charAt(index) + b;
                        index --;
                    }

                    while (index2 != ans.length() && !ops.contains(ans.charAt(index2)))// this is to stop adding to the string once the number stops
                    {
                        c = c + ans.charAt(index2);
                        index2 ++;
                    }

                    sub1.setLong(b);
                    sub2.setLong(c);
                    answer = sub1.add(sub2);
                    String d = answer.toString();

                    if (index2 == ans.length())
                    {
                        ans = d;
                        continue;
                    }

                    else
                    {
                        ans = d + ans.substring(index2);
                    }
                }

                else if (ans.contains("-") & !ans.contains("+"))
                {
                    int index = ans.indexOf("-")-1;
                    int index2 = ans.indexOf("-") +1;

                    while (index >=0)
                    {
                        b = ans.charAt(index) + b;
                        index --;
                    }

                    while (index2 != ans.length() && !ops.contains(ans.charAt(index2)))// this is to stop adding to the string once the number stops
                    {
                        c = c + ans.charAt(index2);
                        index2 ++;
                    }

                    sub1.setLong(b);
                    sub2.setLong(c);
                    answer = sub1.subtract(sub2);
                    String d = answer.toString();

                    if (index2 == ans.length())
                    {
                        ans = d;
                        continue;
                    }

                    else
                    {
                        ans = d + ans.substring(index2);
                    }
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.pack();
        calc.setLocationRelativeTo(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }
}