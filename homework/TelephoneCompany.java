/***************************************
TelephoneCompany.java

Isabel Rodriguez Gonzalez
This program calculates the payment for a telephone call
***************************************/
import javax.swing.JOptionPane;
public class TelephoneCompany
{
  public static void main(String[] args)
  {
    int ti;
    double tu,pag,imp,tot,in,inn;
    String di,turn;
    ti=Integer.parseInt(JOptionPane.showInputDialog("Enter your time in minutes: "));
    di=JOptionPane.showInputDialog("Enter the day of the week: ");
    inn=0;
    tot=0;
    switch(di)
    {
      case "domingo":
          inn=0.03;
          break;
      default:
          turn=JOptionPane.showInputDialog("Enter the turn: ");
          if(turn=="matutino")
          {
            inn=0.15;
            break;
          }
          else if(turn=="vespertino")
          {
            inn=0.10;
            break;
          }
    }
          if(ti<=5)
          {
            in=1;
            pag=in*ti;
            imp=inn*pag;
