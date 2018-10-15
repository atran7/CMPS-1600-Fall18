import java.awt.*;
import java.awt.event.*;
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
            txt.setText(String.valueOf(isValidInput()));
        }
    }

    public boolean isValidInput()
    {
        int ocount = 0; //count the number of open parenthesis
        int ccount = 0; //count the number of closed parenthesis
        display = txt.getText();
        boolean valid = false;
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
                    txt.setText("false");
                    return valid;
                }
            }
        }

        if (ocount != ccount)
        {
            txt.setText("false");
        }
        else
        {
            txt.setText("true");
            valid = true;
        }

        return valid;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.pack();
        calc.setLocationRelativeTo(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }

}