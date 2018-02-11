/*************
MonthlySavings.java

Isabel Rodriguez Gonzalez
This program make sentries in a bridal registry
*************/

import javax.swing.JOptionPane;

public class MonthlySavings
{
  public static void main (String[]args)
  {
    Double AH;
    int M=1;
    int CA=0;
    while (M<=12)
    {
      AH=Double.parseDouble(JOptionPane.showInputDialog("Enter the monthly saving"));
      CA +=AH;
      JOptionPane.showMessageDialog(null, "You have saving: " + CA + " in " + M + " months");
      M ++;
    }
  }
}
