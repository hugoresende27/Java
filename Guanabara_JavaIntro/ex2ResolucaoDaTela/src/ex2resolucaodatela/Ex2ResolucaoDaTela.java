
package ex2resolucaodatela;
import java.awt.*;

/**
 *
 * @author Hugo
 */

public class Ex2ResolucaoDaTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        System.out.println("largura-> "+width+" X altura-> "+height);
        
    }
    
}
