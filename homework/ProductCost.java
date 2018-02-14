/******
ProductCost.java

Isabel Rodriguez Gonzalez
This program calculates the cost of a product in twenty months
***********/
import javax.swing.JOptionPane;

public class ProductCost
{
  public static void main (String[]args)
  {
    int I=1;
    double P=10;
    double T=0;
    while (I<=20)
    {
      JOptionPane.showMessageDialog(null,"The price of the month " + I + " is: " + P);
      T+=P;
      P*=2;
      I++;
    }
    JOptionPane.showMessageDialog(null, "The final price is: " + T);
  }
}
