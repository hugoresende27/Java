package broTutorials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

    JButton btn;

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);


        //BOTÃO
        btn = new JButton("Carregar/Gravar ficheiro");
        btn.addActionListener(this);



        this.add(btn);
        //this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            JFileChooser file = new JFileChooser();

            file.setCurrentDirectory( new File("."));   //para definir a dir default, "." dir do projeto

            //show open escolher ficheiro para abrir
            //int resp =  file.showOpenDialog(null);

            //save dialog para guardar o ficheiro
            int resp =  file.showSaveDialog(null);

            if (resp == JFileChooser.APPROVE_OPTION){
                File fil = new File(file.getSelectedFile().getAbsolutePath());
                System.out.println(fil);//imprime na consola a localização do ficheiro
            }
        }
    }
}
