package broTutorials;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame implements ActionListener {
    JMenuBar menuBar;   //barra
    JMenu ajudaMenu;    //separador
    JMenuItem sobreItem;//item
    JMenu settMenu;    //separador
    JMenuItem velItem;//item

    //CONSTRUCTOR
    GameFrame () {
        //MENUBAR//========================
        menuBar = new JMenuBar();

        //ajudaMenu////////////////
        ajudaMenu = new JMenu("Ajuda");
        sobreItem = new JMenuItem("Sobre");
        sobreItem.addActionListener(this);

        ajudaMenu.add(sobreItem);

        //settingMenu////////////////
        settMenu = new JMenu("Settings");
        velItem = new JMenuItem("Nível");
        velItem.addActionListener(this);

        settMenu.add(velItem);

        //add ao menuBar/////////////////
        menuBar.add(ajudaMenu);
        menuBar.add(settMenu);

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
        if (e.getSource()==velItem){
            setVisible(false); //you can't see me!
            dispose(); //Destroy the JFrame object
            new GameFrame();
             }
    }
}
