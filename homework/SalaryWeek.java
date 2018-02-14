/******************
SalaryWeek.java

Isabel Rodriguez Gonzalez
This program calculate the salary in a week
******************/
import javax.swing.JOptionPane;
public class SalaryWeek
{
  public static void main (String[]args)
  {
    int HT, D=1;
    int SH=0;
    Double PH, SU ;
    PH=Double.parseDouble(JOptionPane.showInputDialog("Enter the hourly wage"));
    while (D<=6)
    {
      HT=Integer.parseInt(JOptionPane.showInputDialog("Enter the hours worked, day: " + D));
      SH +=HT;
      D ++;
    }
    SU=SH*PH;
    JOptionPane.showMessageDialog(null, "Your salary in a week is: " + SU);
  }
}
