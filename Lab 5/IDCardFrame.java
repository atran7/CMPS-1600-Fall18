import java.awt.*;
import javax.swing.*;


public class IDCardFrame extends JFrame
{

    public IDCardFrame()
    {
        setTitle("ID Card");
    }

    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setSize(500,300);
        f.setResizable(false);
        f.setVisible(true);
        f.setTitle("ID Card");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,1));


        ImageIcon icon = new ImageIcon("C:\\Users\\super\\IdeaProjects\\IDCardFrame\\src\\Profile.jpg");
        JLabel pic = new JLabel(icon, JLabel.CENTER);
        pic.setIcon(icon);
        panel.add(pic,BorderLayout.CENTER);


        JLabel nameLabel = new JLabel("Aline Tran");
        f.add(nameLabel, BorderLayout.NORTH);
        nameLabel.setFont(new Font("Times New Roman",Font.ITALIC,25));

        JLabel javaProgrammer = new JLabel("Java Programmer");
        f.add(javaProgrammer, BorderLayout.SOUTH);
        javaProgrammer.setFont(new Font("Sans Serif", Font.BOLD,20));

        JLabel height = new JLabel("Height: 5'");
        JLabel weight = new JLabel("Weight: 100lb");
        JLabel eyeColor = new JLabel("Eye Color: Green");
        JLabel hair = new JLabel("Hair Color: Brunette");
        panel.add(height, BorderLayout.EAST);
        panel.add(weight, BorderLayout.EAST);
        panel.add(eyeColor, BorderLayout.EAST);
        panel.add(hair, BorderLayout.EAST);

        f.add(panel);
    }
}


