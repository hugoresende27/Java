package BroTutorials;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton btn = new JButton("Nova Janela");

    //constructor
    LaunchPage(){
        //BOTAO
        btn.setBounds(100,160,200,40);
        btn.setFocusable(false);
        btn.addActionListener(this);
        //FRAME
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(btn);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource()==btn){
                frame.dispose();//para fechar a janela original
                NewWindow frame2 = new NewWindow();
            }
    }
}
