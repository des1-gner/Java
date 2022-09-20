import javax.swing.*;
import java.awt.*;

public class GreenGUIWithButton extends JFrame{
  //instance variables-conponents
  JPanel pnlGreen;
  JButton btnClick;
   //constructor
  public GreenGUIWithButton(){
    super("Green panel with button");
    //create panel
    pnlGreen = new JPanel();
    //paint it green(Frame cannot be painted)
    pnlGreen.setBackground(Color.GREEN);
    //add panel to frame
    add(pnlGreen, BorderLayout.CENTER);
    //create buttons
    btnClick = new JButton("Don't click!");
    //add button to panel
    pnlGreen.add(btnClick);
    }
  //main
  public static void main(String[] args){
    GreenGUIWithButton fr = new GreenGUIWithButton();
    fr.setSize(300,300);
    fr.setLocationRelativeTo(null);
    fr.setVisible(true);
  }
}
    