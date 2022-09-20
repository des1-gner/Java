import javax.swing.*;
import java.awt.*;

public class GreenGUI extends JFrame{
  //instance variables-conponents
  JPanel pnlGreen;
  JButton btnOk;
  //constructor
  public GreenGUI(){
    super("Green window");
    //create panel
    pnlGreen = new JPanel();
    //paint it green(Frame cannot be painted)
    pnlGreen.setBackground(Color.GREEN);
    //add panel to frame
    add(pnlGreen);
     btnOk = new JButton("Ok");
  // add(btnOk, BorderLayout.NORTH);
     add(btnOk);
   //pnlGreen.add(btnOk);
  }
  //main
  public static void main(String[] args){
    GreenGUI fr = new GreenGUI();
    fr.setSize(600,400);
    fr.setLocationRelativeTo(null);
    fr.setVisible(true);
  }
}
    