package snake;

import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame(){

        GamePanel panel = new GamePanel();

        this.add(panel);
    }
}
