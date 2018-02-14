/************
AverageHeight.java

Isabel Rodriguez Gonzalez
This program calculates the average height
***********/

import javax.swing.JOptionPane;
public class AverageHeight
{
  public static void main (String[]args)
  {
    int C=0;
    double PR, SU=0;
    double ES=0;
    while( ES !=' ')
    {
      ES=Double.parseDouble(JOptionPane.showInputDialog("Enter the height"));
      SU += ES;
      C ++;
    }
    PR=SU/C;
    JOptionPane.showMessageDialog(null,"The average height is " + PR);
  }
}
