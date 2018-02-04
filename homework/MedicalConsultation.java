/***************************************
MedicalConsultation.java

Isabel Rodriguez Gonzalez
This program determines the payment by the medical consultation
***************************************/
import javax.swing.JOptionPane;
public class MedicalConsultation
{
  public static void main(String[] args)
  {
    int nc,cc;
    double tot;
    nc=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of cites: "));
      if(nc<=3)
      {
        cc=200;
        tot=cc*nc;
        JOptionPane.showMessageDialog(null,"The price of the cite is: $"+cc+"\n The cost for the treatment is: $"+tot);
      }
      else if(nc<=5)
      {
        cc=150;
        tot=600+(nc-3)*cc;
        JOptionPane.showMessageDialog(null,"The price of the cite is: $"+cc+"\n The cost for the treatment is: $"+tot);
      }
      else if(nc<=8)
      {
        cc=100;
        tot=900+(nc-5)*cc;
        JOptionPane.showMessageDialog(null,"The price of the cite is: $"+cc+"\n The cost for the treatment is: $"+tot);
      }
      else if(nc>8)
      {
        cc=50;
        tot=1200+(nc-8)*cc;
        JOptionPane.showMessageDialog(null,"The price of the cite is: $"+cc+"\n The cost for the treatment is: $"+tot);
      }
  }
}
