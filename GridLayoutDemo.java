  import javax.swing.*;
  import java.awt.*;

  public class GridLayoutDemo extends JFrame {
     JLabel lblFirst, lblLast;
     JTextField txtFirst, txtLast;
    public GridLayoutDemo() {
      // Set GridLayout with 2 rows and 2 columns, and gaps 5  
      setLayout(new GridLayout(2, 2, 10, 30));
      lblFirst = new JLabel("First Name"); 
      add(lblFirst);
      txtFirst = new JTextField(8); 
      add(txtFirst);
      lblLast =  new JLabel("Last Name");
      add(lblLast);
      txtLast =  new JTextField(8);
      add(txtLast);
    }
    public static void main(String[] args) {
      GridLayoutDemo frame = new GridLayoutDemo();
      frame.setTitle("GridLayout");
      frame.setLocationRelativeTo(null); // Center the frame
      frame.setSize(300, 200);
      frame.setVisible(true);
    }
  }
