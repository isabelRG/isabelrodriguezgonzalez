/***************************************
StudyTrip.java

Isabel Rodriguez Gonzalez
This program calculates the payment by a travel
***************************************/
import javax.swing.JOptionPane;
public class StudyTrip
{
  public static void main(String[] args)
  {
    int na;
    double pa,tot;
    na=Integer.parseInt(JOptionPane.showInputDialog("enter the students who will attend the study trip"));
    if(na<30)
    {
      pa=4000/na;
      tot=4000;
      JOptionPane.showMessageDialog(null,"Payment for student:$ "+pa+"\n Payment to the company:$ "+tot);
    }
    else if(na>30)
    {
      pa=95;
      tot=pa*na;
      JOptionPane.showMessageDialog(null,"Payment for student:$ "+pa+"\n Payment to the company:$ "+tot);
    }
    else if(na>50)
    {
      pa=70;
      tot=pa*na;
      JOptionPane.showMessageDialog(null,"Payment for student:$ "+pa+"\n Payment to the company:$ "+tot);
    }
    else if(na>99)
    {
      pa=70;
      tot=pa*na;
      JOptionPane.showMessageDialog(null,"Payment for student:$ "+pa+"\n Payment to the company:$ "+tot);
    }
  }
}
