package broTutorials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StopWatch implements ActionListener {

    JTextArea temposLbl = new JTextArea();

    ArrayList <String> objArray = new ArrayList<>();


    JMenuBar menuBar;   //barra
    JMenu ajudaMenu;    //separador
    JMenuItem sobreItem;//item

    JFrame frame = new JFrame();
    JButton startBtn = new JButton("start");
    JButton resetBtn = new JButton("reset");
    JLabel timeLlb = new JLabel();
    int timeQtd = 0;
    int miliQtd = 0;
    int secQtd = 0;
    int minQtd = 0;
    int hoursQtd = 0;
    boolean started = false;
    String miliStr = String.format("%02d",miliQtd);
    String segsStr = String.format("%02d",secQtd);
    String minStr = String.format("%02d",minQtd);
    String hoursStr = String.format("%02d",hoursQtd);

    Timer timer = new Timer(10, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            timeQtd += 1000;
            hoursQtd = (timeQtd/3600000);
            minQtd = (timeQtd/60000) % 60;
            secQtd = (timeQtd/1000) % 60;       //%60 para não mostrar valores acima de 60
            miliQtd = (timeQtd/100) % 60;

            miliStr = String.format("%02d",miliQtd);
            segsStr = String.format("%02d",secQtd);
            minStr = String.format("%02d",minQtd);
            hoursStr = String.format("%02d",hoursQtd);

            timeLlb.setText(hoursStr+ ":" +minStr + ":" + segsStr+ ":"+miliStr);

        }
    });


    //CONSTRUTOR//=====================================
    StopWatch(){

        //MENUBAR//========================
        menuBar = new JMenuBar();

        //ajudaMenu////////////////
        ajudaMenu = new JMenu("Ajuda");
        sobreItem = new JMenuItem("Sobre");
        sobreItem.addActionListener(this);

        ajudaMenu.add(sobreItem);

        //add ao menuBar/////////////////
        menuBar.add(ajudaMenu);

        frame.setJMenuBar(menuBar);//adicionar o menubar, setJMenuBar
        //============================================================

        timeLlb.setText(hoursStr + ":" + minStr + ":" + segsStr+":"+miliStr);
        timeLlb.setBounds(75,0,250,100);
        timeLlb.setFont(new Font("Consolas",Font.PLAIN,35));
        timeLlb.setBorder(BorderFactory.createBevelBorder(1));
        timeLlb.setOpaque(true);
        timeLlb.setHorizontalAlignment(JTextField.CENTER);

        temposLbl.setText("Tempos");
        temposLbl.setBounds(0,150,420,400);
        temposLbl.setFont(new Font("Consolas",Font.BOLD,35));
        temposLbl.setBorder(BorderFactory.createBevelBorder(1));
        temposLbl.setOpaque(true);
        temposLbl.setEditable(false);

        startBtn.setBounds(100,100,100,50);
        startBtn.setFont(new Font("Ink Free",Font.PLAIN,20));
        startBtn.setFocusable(false);
        startBtn.addActionListener(this);

        resetBtn.setBounds(200,100,100,50);
        resetBtn.setFont(new Font("Ink Free",Font.PLAIN,20));
        resetBtn.setFocusable(false); //border q fica no botão se true
        resetBtn.addActionListener(this);

        frame.add(startBtn);
        frame.add(resetBtn);

        frame.add(temposLbl);
        frame.add(timeLlb);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,620);
        frame.setLayout(null);//sem layout manager
        frame.setTitle("StopWatch HR@2022");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.black);


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

                String x = timeLlb.getText();
                objArray.add(x);
                System.out.println(x);

                String formattedString = objArray.toString()
                        .replace(",", "")  //remove the commas
                        .replace("[", "")  //remove the right bracket
                        .replace("]", "")  //remove the left bracket
                        .trim();           //remove trailing spaces from partially initialized arrays

                temposLbl.setLineWrap(true);//wrap das linhas
                temposLbl.setWrapStyleWord(true);//para quebrar a linha
                temposLbl.setText(formattedString);
            }
        }

        if (e.getSource()==resetBtn){
            started=false;
            startBtn.setText("start");
            reset();
        }
        if (e.getSource()==sobreItem){
            JOptionPane.showMessageDialog(null,"Programa criado por Hugo Resende @2022\nCronómetro de precisão milisegundos","Ajuda",JOptionPane.PLAIN_MESSAGE);
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
        miliQtd = 0;
        secQtd=0;
        minQtd=0;
        hoursQtd=0;

        miliStr = String.format("%02d",miliQtd);
        segsStr = String.format("%02d",secQtd);
        minStr = String.format("%02d",minQtd);
        hoursStr = String.format("%02d",hoursQtd);

        timeLlb.setText(hoursStr+ ":" +minStr + ":" + segsStr+":"+miliStr);
    }
}
