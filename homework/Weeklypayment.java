/***********
Weeklypayment.java

Isabel Rodriguez Gonzalez
This program calculates the weekly balance of an employee
************/
import javax.swing.JOptionPane;

public class Weeklypayment
{
  public static void main (String[]args)
  {
    int N, I=1;
    double HT, PH, SS=0;
    double SF=0;
    N=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of employee"));
    PH=Double.parseDouble(JOptionPane.showInputDialog("Enter the payment per hour"));
    while (N<=I)
    {
      HT=Double.parseDouble(JOptionPane.showInputDialog("Enter the hours worked during the week"));
      SS=HT*PH;
      I++;
      SF +=SS;
    }
    JOptionPane.showMessageDialog(null,"The total to pay is: " + SF);
  }
}
