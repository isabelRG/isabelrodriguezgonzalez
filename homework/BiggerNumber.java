/********************************
BiggerNumber.java

Isabel Rodriguez Gonzalez
This program finds the greatest of two numbers
***********************************/
import javax.swing.JOptionPane;
public class BiggerNumber
{
  public static void main(String[] args)
  {
    int a,b,m;
    a=Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
    b=Integer.parseInt(JOptionPane.showInputDialog("Enter other number: "));
    if(a>b)
    {
      m=a;
    }
    else
    {
      m=b;
    }
    JOptionPane.showMessageDialog(null,"The bigger number is: "+m);
  }
}
