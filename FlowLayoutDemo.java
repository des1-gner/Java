import javax.swing.*;
import java.awt.*;
  public class FlowLayoutDemo extends JFrame {
      JLabel lblFirst, lblLast;
      JTextField txtFirst, txtLast;
    public FlowLayoutDemo() {
      // set FlowLayout
      setLayout (new FlowLayout());
      // create and add labels and text fields to the frame
      lblFirst = new JLabel("First Name");  add(lblFirst);
      txtFirst = new JTextField(8);  add(txtFirst);
      lblLast =  new JLabel("Last Name"); add(lblLast);
      txtLast =  new JTextField(8); add(txtLast);
    }
    public static void main(String[] args) {
      FlowLayoutDemo frame = new FlowLayoutDemo();
      frame.setTitle("Input frame");
      frame.setSize(300,200);
      frame.setLocationRelativeTo(null); // Center the frame
      frame.setVisible(true);
    }
  }
