package broTutorials;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame implements ActionListener {
    JMenuBar menuBar;   //barra
    JMenu ajudaMenu;    //separador
    JMenuItem sobreItem;//item

    //CONSTRUCTOR
    GameFrame () {
        //MENUBAR//========================
        menuBar = new JMenuBar();

        //ajudaMenu////////////////
        ajudaMenu = new JMenu("Ajuda");
        sobreItem = new JMenuItem("Sobre");
        sobreItem.addActionListener(this);

        ajudaMenu.add(sobreItem);

        //add ao menuBar/////////////////
        menuBar.add(ajudaMenu);

        this.setJMenuBar(menuBar);//adicionar o menubar, setJMenuBar
        //============================================================

       this.add(new GamePanel());
       this.setTitle("Snake Game HR@2022");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setResizable(false);
       this.pack();
       this.setVisible(true);
       this.setLocationRelativeTo(null);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==sobreItem){
            JOptionPane.showMessageDialog(null,"Programa criado por Hugo Resende @2022\nSnake Game","Ajuda",JOptionPane.PLAIN_MESSAGE);
        }
    }
}
