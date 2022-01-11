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

    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            timeQtd += 1000;
            hoursQtd = (timeQtd/3600000);
            minQtd = (timeQtd/60000) % 60;
            secQtd = (timeQtd/1000) % 60;       //%60 para não mostrar valores acima de 60

            segsStr = String.format("%02d",secQtd);
            minStr = String.format("%02d",minQtd);
            hoursStr = String.format("%02d",hoursQtd);

            timeLlb.setText(hoursStr+ ":" +minStr + ":" + segsStr);

        }
    });

    StopWatch(){

        timeLlb.setText(hoursStr + ":" + minStr + ":" + segsStr);
        timeLlb.setBounds(100,100,200,100);
        timeLlb.setFont(new Font("Consolas",Font.PLAIN,35));
        timeLlb.setBorder(BorderFactory.createBevelBorder(1));
        timeLlb.setOpaque(true);
        timeLlb.setHorizontalAlignment(JTextField.CENTER);

        startBtn.setBounds(100,200,100,50);
        startBtn.setFont(new Font("Ink Free",Font.PLAIN,20));
        startBtn.setFocusable(false);
        startBtn.addActionListener(this);

        resetBtn.setBounds(200,200,100,50);
        resetBtn.setFont(new Font("Ink Free",Font.PLAIN,20));
        resetBtn.setFocusable(false); //border q fica no botão se true
        resetBtn.addActionListener(this);

        frame.add(startBtn);
        frame.add(resetBtn);

        frame.add(timeLlb);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);//sem layout manager
        frame.setTitle("StopWatch HR@2022");
        frame.setLocationRelativeTo(null);


        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==startBtn){

            if (started == false){
                started=true;
                startBtn.setText("stop");
                start();
            }
            else {
                started=false;
                startBtn.setText("start");
                stop();
            }
        }

        if (e.getSource()==resetBtn){
            started=false;
            startBtn.setText("start");
            reset();
        }

    }

    ///////////STOP////////////////
    void start(){
        timer.start();
    }

    ///////////STOP////////////////
    void stop(){
        timer.stop();
    }

    ///////////RESET////////////////
    void reset(){
        timer.stop();
        timeQtd=0;
        secQtd=0;
        minQtd=0;
        hoursQtd=0;

        segsStr = String.format("%02d",secQtd);
        minStr = String.format("%02d",minQtd);
        hoursStr = String.format("%02d",hoursQtd);

        timeLlb.setText(hoursStr+ ":" +minStr + ":" + segsStr);
    }
}
