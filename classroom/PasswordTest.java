/************************
PasswordTest.java
Isabel Rodriguez Gonzalez
*************************/
import javax.swing.*;
public class PasswordTest
{
  public static void main(String[] args)
  {
    Password person;
    person=new Password();
    boolean b=false,a=false;
    int opc;
    int opc1=0;
    do
    {
      opc=Integer.parseInt(JOptionPane.showInputDialog(null, "Select a option \n1: Enter your password \n2: Check the security \n3:Exit"));
      switch (opc)
      {
        case 1:
          person.setPassword(JOptionPane.showInputDialog(null, "Enter your password"));
          break;
        case 2:
          a=person.getIsStrong();
          if (b!=false)
          {
            if (a==true)
            {
              JOptionPane.showMessageDialog(null, "Your password is secure");
            }
            else if (a==false)
            {
              JOptionPane.showMessageDialog(null, "Your password isnt secure");
            }
          }
          break;
        case 3:
          JOptionPane.showMessageDialog(null, "See you later");
          opc=9;
          break;
        default:
        opc1=JOptionPane.showConfirmDialog(null, "Error");
        break;
      }
    }
    while (opc!=9 || opc1!=JOptionPane.YES_OPTION);
    }
}
