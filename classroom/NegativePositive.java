/*******************************
NegativePositive.java
Isabel Rodriguez Gonzalez
This program prints if a number is posive or negative
*******************************/
import javax.swing.JOptionPane;

public class NegativePositive{
  public static void main(String[] args) {
  double number;

  number = Double.parseDouble(JOptionPane.showInputDialog("Enter a number"));

  if (number > 0){
    JOptionPane.showMessageDialog(null, "Your number is POSITIVE");
  }else {
    JOptionPane.showMessageDialog(null, "your number is NEGATIVE");
  }
  }
}
