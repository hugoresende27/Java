package broTutorials;

import javax.swing.*;

public class MyFrame extends JFrame {

    DragPanel dragp = new DragPanel();

    MyFrame(){

        this.add(dragp);

        this.setTitle("Frame de Drag and Drop");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
    }
}
