/******************
PaymentForPencils.java

Isabel Rodriguez Gonzalez
This program is to know how much you will pay different amount of pencils
**********************/
import javax.swing.JOptionPane;
public class PaymentForPencils{
  public static void main(String[]args){
    int X;
    double A, Pag;
    X = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of pencil: "));
    if ( X >= 1000 ){
      A = .85;
    }else{
      A = .90;
      Pag = X*A;
      JOptionPane.showMessageDialog(null,"The price for: " + X + "is:" + Pag);
    }
  }
}
