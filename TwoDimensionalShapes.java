import javax.swing.*;
import java.awt.*;

public class TwoDimensionalShapes extends JPanel{

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //converts graphics into graphics2D
        Graphics2D g2 = (Graphics2D) g;

        //Draw a rectangle drawRect(x,y,width,height)
        g2.drawRect(50, 50, 100, 80);

        //Draw a oval drawOval(x,y,width,height)
        g2.drawOval(200, 50, 100, 80);

        //Draw a line drawLine(x1,y1,x2,y2)
        g2.drawLine(50, 170, 300, 170);

    }
      public static void main(String[] args){
        //Create a main window frame
        JFrame frame = new JFrame("Two Dimensional Shapes");

        //Add the TwoDimensionalShapes panel to the frame
        frame.add(new TwoDimensionalShapes());

        //Set window ssize
        frame.setSize(400, 300);

        //close the application when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Display the window in the center of the screen
        frame.setVisible(true);

      }

    }