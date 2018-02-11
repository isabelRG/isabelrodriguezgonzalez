/************
AverageAge.java

Isabel Rodriguez Gonzalez
This program calculates the average age
***********/

import javax.swing.JOptionPane;
public class AverageAge
{
  public static void main (String[]args)
  {
    int ED,NU, SU=0;
    int C=1;
    double PR;
    NU=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of persons"));
    while( C <= NU)
    {
      ED=Integer.parseInt(JOptionPane.showInputDialog("Enter the age"));
      SU += ED;
      C ++;
    }
    PR=SU/NU;
    JOptionPane.showMessageDialog(null,"The average ages is " + PR);
  }
}
