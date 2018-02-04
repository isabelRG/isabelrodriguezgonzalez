/***************************************
UnknownTown.java

Isabel Rodriguez Gonzalez
This program determines what type of credit have
***************************************/
import javax.swing.JOptionPane;
public class UnknownTown
{
  public static void main(String[] args)
  {
    int tt;
    double la,ac,nc;
    String per;
    tt=Integer.parseInt(JOptionPane.showInputDialog("Enter your type of card: "));
    la=Double.parseDouble(JOptionPane.showInputDialog("Enter your current credit limit: "));
     switch(tt)
     {
       case 1:
          per="25%";
          ac=la*0.25;
          nc=ac+la;
          break;
      case 2:
          per="35%";
          ac=la*0.35;
          nc=ac+la;
          break;
      case 3:
          per="40%";
          ac=la*0.40;
          nc=ac+la;
          break;
      default:
          per="50%";
          ac=la*0.50;
          nc=ac+la;
          break;
     }
     JOptionPane.showMessageDialog(null,"Type of card: "+tt+"\n Current credit limit: "+la+"\n Percentage of credit increase "+per+"\n Credit increase: "+ac+"\n New credit limit: "+nc);
  }
}
