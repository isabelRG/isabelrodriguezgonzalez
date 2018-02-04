/******************
PaymentForPencils.java

Isabel Rodriguez Gonzalez
This program is to know how much you will pay different amount of pencils
**********************/
import javax.swing.JOptionPane;
public class PaymentForPencils{
  public static void main(String[]args){
    double a, Costo,Pag;
    a=Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
    if ( a > 1000 ){
      Costo = .85;
      Pag=(a*.85);
    }else{
      Costo = .90;
      Pag=(a*.90);
      JOptionPane.showMessageDialog(null,"The bigger number is: "+Pag);
    }
  }
}
