package broTutorials;

import javax.swing.*;

public class GameFrame extends JFrame {

    //CONSTRUCTOR
    GameFrame () {

       this.add(new GamePanel());
       this.setTitle("Snake Game HR@2022");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setResizable(false);
       this.pack();

    }

}
