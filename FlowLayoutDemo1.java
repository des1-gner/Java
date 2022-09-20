import javax.swing.*;
import java.awt.*;
 
 public class FlowLayoutDemo1 extends JFrame {
    public FlowLayoutDemo1() {
       // Set FlowLayout to Frame (default is BorderLayout)
      setLayout(new FlowLayout());
      // Add buttons to the frame
      add(new JButton("EastEastEastEast"));
      add(new JButton("South"));
      add(new JButton("West"));
      add(new JButton("North"));
      add(new JButton("Center"));
    }

    /** Main method */
    public static void main(String[] args) {
      FlowLayoutDemo1 frame = new FlowLayoutDemo1();
      frame.setTitle("FlowLayout");
      frame.setLocationRelativeTo(null); // Center the frame
      frame.setSize(300, 200);
      frame.setVisible(true);
    }
  }
