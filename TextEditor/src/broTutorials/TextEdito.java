package broTutorials;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextEdito extends JFrame implements ActionListener {

    JTextArea txtArea;  //area de texto
    JScrollPane scrollPane; //scroll pane vai ter dentro a area de texto
    JLabel fontLabel;       //label a dizer Size antes do spinner de input do tam da font
    JSpinner fontSizeSpinner;   //spinner de input font size
    JButton btnCores ;      //botão para mudar de cor
    JComboBox fontBox; //botão tipo de letra

    //menu bar
    JMenuBar menuBar;
    JMenu fileMenu;
        JMenuItem openItem;
        JMenuItem saveItem;
        JMenuItem exitItem;
    JMenu ajudaMenu;
        JMenuItem sobreItem;

    //construtor
    TextEdito(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Text Editor HR @2022");
        this.setSize(500,500);
        this.getContentPane().setBackground(Color.gray);

        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);   //centrar janela
        this.setResizable(false);

        //text area add ao frame no construtor, dimensões 50px mais pequenas do que frame
        txtArea = new JTextArea();
        txtArea.setLineWrap(true);//wrap das linhas
        txtArea.setWrapStyleWord(true);//para quebrar a linha
        txtArea.setFont(new Font("Consolas", Font.PLAIN,60));
        txtArea.setBackground(Color.black);
        txtArea.setForeground(Color.green);

        //scroll pane (txtArea adicionada a scroll pane)
        scrollPane = new JScrollPane(txtArea);
        scrollPane.setPreferredSize(new Dimension(450,450));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        //label da font
        fontLabel = new JLabel("Tamanho: ");
        //fontLabel.setForeground(Color.green);//mudar cor do texto na label size
        //font size spinner
        fontSizeSpinner = new JSpinner();
        fontSizeSpinner.setPreferredSize(new Dimension(50,25));
        fontSizeSpinner.setValue(60);
        fontSizeSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                //set da font de txtArea, getFont + getValue do spinner com cast para (int)
                txtArea.setFont(new Font(txtArea.getFont().getFamily(),Font.PLAIN,(int)fontSizeSpinner.getValue()));
            }
        });

        //botão de cor da font
        btnCores = new JButton("COR");
        btnCores.setBackground(Color.green);
        btnCores.addActionListener(this);


        //tipo de letra  fontbox
        //array de strings com todas as fontes disponiveis em JAVA
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        fontBox = new JComboBox(fonts);
        fontBox.addActionListener(this);
        fontBox.setSelectedItem("Consolas");

        //==================== menubar =================================

            menuBar = new JMenuBar();
            //fileMenu//////////
            fileMenu = new JMenu("Ficheiro");
            openItem = new JMenuItem("Abrir");
            saveItem = new JMenuItem("Guardar");
            exitItem = new JMenuItem("Sair");

            //action listeners fileMenu
            openItem.addActionListener(this);
            saveItem.addActionListener(this);
            exitItem.addActionListener(this);

            fileMenu.add(openItem);
            fileMenu.add(saveItem);
            fileMenu.add(exitItem);

            //ajudaMenu////////////////
            ajudaMenu = new JMenu("Ajuda");
            sobreItem = new JMenuItem("Sobre");

            ajudaMenu.add(sobreItem);

            //add ao menuBar/////////////////
            menuBar.add(fileMenu);
            menuBar.add(ajudaMenu);
        //====================  =================================

        this.setJMenuBar(menuBar);//adicionar o menubar, setJMenuBar
        this.add(fontLabel);//etiqueta com texto size
        this.add(fontSizeSpinner);//spinner do tamanho
        this.add(btnCores);//btn de cores
        this.add(fontBox);//botão tipos de letra
        this.add(scrollPane);//scroll pane adicionado à frame por ultimo
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //action listener para o botão de cores , se e.getSource == btnCores
        if (e.getSource()==btnCores){
            //instanciar uma JChooseColor
            JColorChooser paletaDeCores = new JColorChooser();
            //var cor da classe Color vai ser lida através de um showDialog
            Color cor = paletaDeCores.showDialog(null,"Escolha a cor",Color.red);
            txtArea.setForeground(cor);//mudar a cor do texto em txtArea
        }

        //action listener para tipo e letra font box
        if (e.getSource()==fontBox){
            //set Font para new Font , cast (String) de getSelectedItem, txtArea.getFont.getSize
            txtArea.setFont (new Font((String)fontBox.getSelectedItem(),Font.PLAIN,txtArea.getFont().getSize()));
        }

        //actionlistener fileMenu
        ////////////// LOAD ITEM ///////////////////////////
        if (e.getSource()==openItem){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));
            //filtro para abrir apenas ficheiros txt
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Text Files","txt");
            fileChooser.setFileFilter(filtro);//aplicar o filtro no fileChooser

            int rsp = fileChooser.showOpenDialog(null);

            if (rsp == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                Scanner fileIn = null;

                try {
                    fileIn = new Scanner(file);
                    if (file.isFile()){
                        while (fileIn.hasNextLine()){//ler o ficheiro linha a linha
                            String linha = fileIn.nextLine() + "\n";
                            txtArea.append(linha);
                        }
                    }
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                finally {
                    fileIn.close();
                }
            }

        }
        ////////////// SAVE ITEM //////////////////////////
        if (e.getSource()==saveItem){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));//file path por defeito, . para ser a dir do projeto

            int rsp = fileChooser.showSaveDialog(null);
            if (rsp == JFileChooser.APPROVE_OPTION){//se a opção de local de gravação for aceite
                File file;
                PrintWriter fileOut = null;

                file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                try {
                    fileOut = new PrintWriter(file);
                    fileOut.println(txtArea.getText());
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                finally {
                    fileOut.close();
                }
            }
        }
        if (e.getSource()==exitItem){
            System.exit(0);
        }
    }
}
