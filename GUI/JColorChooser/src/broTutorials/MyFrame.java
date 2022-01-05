package broTutorials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton btn;
    JLabel lbl;

    MyFrame () {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        btn = new JButton("Escolha a cor");
        btn.addActionListener(this);    //activar o botão
        lbl = new JLabel();

        //cor da label
        lbl.setBackground(Color.white);
        lbl.setOpaque(true);
        //texto da label
        lbl.setText("Isto é algum texto");
        //font
        lbl.setFont(new Font("Consolas", Font.PLAIN,100));


        this.add(btn);
        this.add(lbl);

        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn){
            JColorChooser cor = new JColorChooser();
            Color cor2 = JColorChooser.showDialog(null,"Cores",Color.black);

            //mudar a cor do texto na label
            //lbl.setForeground(cor2);
            //mudar o background da label
            lbl.setBackground(cor2);
        }
    }
}
