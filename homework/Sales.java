/*************
Sales.java

Isabel Rodriguez Gonzalez
This program calculates the value of sales
**************/
import javax.swing.JOptionPane;

public class Sales
{
  public static void main (String[]args)
  {
    double N, V, CN=1;
    double T1=0;
    double TT=0;
    double T2=0;
    double T3=0;
    int A = 0;
    int B = 0;
    int C= 0;
    N=Double.parseDouble(JOptionPane.showInputDialog("Enter the number of sales"));
    while (CN<=N)
    {
      V=Double.parseDouble(JOptionPane.showInputDialog("Enter the value of sale"));
      CN ++;
      TT +=V;
      if (V<=500)
      {
        C ++;
        T3 +=V;
      }else{
        if (V<=1000)
        {
          B ++;
          T2 +=V;
        }else{
          A ++;
          T1 +=V;
        }
      }
    }
    JOptionPane.showMessageDialog(null,"Sales type A were: " + A + " and its value is: " + T1 + "\nSales type B were: " + B + " and its value is: " + T2 + "\nSales type A were: " + C + " and its value is: " + T3 + "\nThe entire sales were: " + CN + " and the total cost was: " + TT);
  }
}
