import javax.swing.*;
import java.awt.*;

public class SliderDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame(
            "Anil | 21 | JSlider"
        );

        frame.setSize(500, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel(
            "Percentage: 50%",
            JLabel.CENTER
        );

        JSlider slider = new JSlider(0, 100, 50);

        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        slider.addChangeListener(e -> {
            label.setText(
                "Percentage: " + slider.getValue() + "%"
            );
        });

        frame.setLayout(new BorderLayout());

        frame.add(label, BorderLayout.NORTH);
        frame.add(slider, BorderLayout.CENTER);

        frame.setVisible(true);
    }
} 
    

