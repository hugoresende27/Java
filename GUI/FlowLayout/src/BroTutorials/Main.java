package BroTutorials;

import javax.swing.*;
import java.awt.*;

//The Java FlowLayout class is used to arrange the components in a line, one after another (in a flow).
// It is the default layout of the applet or panel
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        //frame.setLayout(new FlowLayout());//FLOWLAYOUT
        //frame.setLayout(new FlowLayout(FlowLayout.LEADING));//ALINHADO À ESQ O FLOWLAYOUT
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));     //CENTRO
        //frame.setLayout(new FlowLayout(FlowLayout.TRAILING,10,10));   //DIREITA

        /////////PANELS
        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(150,150));
        panel1.setBackground(Color.lightGray);
        panel1.setLayout(new FlowLayout());


        ////////BOTÕES

        //JButton btn1 = new JButton("1");
        //JButton btn2 = new JButton("2");
        //JButton btn3 = new JButton("3");
        //JButton btn4 = new JButton("4");
        //JButton btn5 = new JButton("5");
        //JButton btn6 = new JButton("6");
        //JButton btn7 = new JButton("7");
        //JButton btn8 = new JButton("8");
        //JButton btn9 = new JButton("9");

        panel1.add( new JButton("1"));
        panel1.add(new JButton("2"));
        panel1.add( new JButton("4"));
        panel1.add( new JButton("5"));
        panel1.add( new JButton("6"));
        panel1.add( new JButton("7"));
        panel1.add( new JButton("8"));
        panel1.add( new JButton("9"));
        panel1.add( new JButton("10"));

        frame.add(panel1);

        frame.setVisible(true);

    }
}
