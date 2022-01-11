package broTutorials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopWatch implements ActionListener {

    JFrame frame = new JFrame();
    JButton startBtn = new JButton("start");
    JButton resetBtn = new JButton("reset");
    JLabel timeLlb = new JLabel();
    int timeQtd = 0;
    int secQtd = 0;
    int minQtd = 0;
    int hoursQtd = 0;
    boolean started = false;
    String segsStr = String.format("%02d",secQtd);
    String minStr = String.format("%02d",minQtd);
    String hoursStr = String.format("%02d",hoursQtd);

    StopWatch(){

        timeLlb.setText(hoursStr + ":" + minStr + ":" + segsStr);
        timeLlb.setBounds(100,100,200,100);
        timeLlb.setFont(new Font("Consolas",Font.PLAIN,35));
        timeLlb.setBorder(BorderFactory.createBevelBorder(1));
        timeLlb.setOpaque(true);
        timeLlb.setHorizontalAlignment(JTextField.CENTER);

        frame.add(timeLlb);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);//sem layout manager
        frame.setTitle("StopWatch HR@2022");


        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    ///////////STOP////////////////
    void start(){

    }

    ///////////STOP////////////////
    void stop(){

    }

    ///////////RESET////////////////
    void reset(){

    }
}
