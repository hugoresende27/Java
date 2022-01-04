package broTutorials;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo(){

        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100, 50);

        slider.setPreferredSize(new Dimension(400,400));    //tamanho do slider

        slider.setPaintTicks(true);     //
        slider.setMinorTickSpacing(10);     //passo do slider MINOR

        slider.setPaintTicks(true);     //
        slider.setMajorTickSpacing(25);     //passo do slider MAJOR

        slider.setPaintLabels(true);        //aparecem os MAJOR ticks
        slider.setFont(new Font("Consolas", Font.PLAIN,15)); //font type

        slider.setOrientation(SwingConstants.VERTICAL);     //slider na vertical

        label.setText("ºC = "+ slider.getValue());
        label.setFont(new Font("MV Boli",Font.PLAIN,25));

        slider.addChangeListener(this);     //para o listener funcionar, change this
        panel.add(slider);
        panel.add(label);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.pack();
        frame.setVisible(true);


    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("ºC = "+ slider.getValue());      //sempre q muda o estado do slider executa
    }
}
