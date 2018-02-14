/*************
Zero.java

Isabel Rodriguez Gonzalez
This program make sentries in a bridal registry
*************/

import javax.swing.JOptionPane;

public class Zero
{
  public static void main (String[]args)
  {
    int CA;
    int CP=0;
    int CC=0;
    int C=1;
    int CN=0;
    while (CA!=(' '))
    {
      CA=Integer.parseInt(JOptionPane.showInputDialog("Enter a quntity"));
      C ++;
      if (CA==0)
      {
        CC ++;
      }else{
        if (CA>0)
        {
          CP ++;
        }else{
          CN ++;
        }
      }
    }
    JOptionPane.showMessageDialog(null,"The total of number entered is: " + C + "\nThe total of positive numbers is: " + CA + "\nThe total of negative numbers is: " + CN + "\nThe total of numbers equal to zero is: " + CC);
  }
}
