/**********************
CostumeDiscount.java

Isabel Rodriguez Gonzalez
This program is to know what will be the discount of the suit
***************************/
import javax.swing.JOptionPane;
public class CostumeDiscount {
     public static void main(String[] args) {
      int CT;
      double DE, PF;
      CT = Integer.parseInt(JOptionPane.showInputDialog("Enter cost of suit"));
      if(CT>2500){
          DE = CT*0.15;
      }else{
          DE = CT*0.08;
          }
          PF = CT-DE;
          JOptionPane.showMessageDialog(null, "The discount applied to the price is: " + DE + "The final price is: " + PF);
          }
      }
