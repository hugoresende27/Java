package broTutorials;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {

    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    //ICONES
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        //ICONES
        loadIcon = new ImageIcon("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\GUI\\images_extra\\fixe.png");
        saveIcon = new ImageIcon("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\GUI\\images_extra\\hamb.jpg");
        exitIcon = new ImageIcon("E:\\Other projects\\GitHub\\MeusProjetos\\JAVA\\Java\\GUI\\images_extra\\pizza.jpg");


        ///CRIAR JMENUBAR
        JMenuBar menu1 = new JMenuBar();

        //CRIAR JMENU SEPARADORES
        JMenu fileMenu = new JMenu("Ficheiro");
        JMenu editMenu = new JMenu("Editar");
        JMenu helpMenu = new JMenu("Ajuda");

        //CRIAR ITEMS DOS SEPARADORES
        loadItem = new JMenuItem("Carregar");
        saveItem = new JMenuItem("Guardar");
        exitItem = new JMenuItem("Sair");

        //ACTIONLISTENER DE OPÇOES DO MENU COM this
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        //ICONES
        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);



        //ADICIONAR ATALHOS DE TECLAS AO MENUS
        loadItem.setMnemonic(KeyEvent.VK_L); //L para load
        saveItem.setMnemonic(KeyEvent.VK_T); //F5 para save
        exitItem.setMnemonic(KeyEvent.VK_S); //L para exit

        //ATALHOS DOS SEPARADORES --> TECLA ALT + ATALHO
        fileMenu.setMnemonic(KeyEvent.VK_F);
        editMenu.setMnemonic(KeyEvent.VK_E);
        helpMenu.setMnemonic(KeyEvent.VK_F9);

        //ADICIONAR OS ITEMS AO SEPARADOR filemenu
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);


        //ADICIONAR OS SEPARADORES AO MENU
        menu1.add(fileMenu);
        menu1.add(editMenu);
        menu1.add(helpMenu);

        //ADICIONAR O JMENUBAR À JANELA
        this.setJMenuBar(menu1);
        this.setVisible(true);

    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==loadItem){
            System.out.println("Load de ficheiro");
        } else if (e.getSource()==saveItem){
            System.out.println("Save do ficheiro");
        } else {
            System.exit(0); //exit do sistema
        }

    }
}
