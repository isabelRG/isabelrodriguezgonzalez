/************
Mientras.java

Isabel Rodriguez Gonzalez
This program makes the sum of ten numbers
***********/

import javax.swing.JOptionPane;
public class Mientras
{
  public static void main (String[]args)
  {
    int C=1, su=0;
    Double VA;
    while( C <= 10)
    {
      VA=Double.parseDouble(JOptionPane.showInputDialog("Enter the number"));
      su += VA;
      C ++;
    }
    JOptionPane.showMessageDialog(null,"The result is " + su);
  }
}
