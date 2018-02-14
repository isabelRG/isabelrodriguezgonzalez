/***********
PrintPurchaseOrderGui.java
Isabel Rodriguez Gonzalez

This program calculates and prints a purchase arder report
*****************/
import javax.swing.JOptioPane;

public class PrintPurchaseOrderGui{
  public static void main(String[]args){
    String itemName; //name of purchase intem
    double price; //price of purchase intem
    int quiantity; //number of items purchase
    itemName=JOptionPane.showImputDialog("Enetre name of purchase item");
    price=Double.parseDouble(JOptionPane.showImputDialog("Enter price of one item"));
    quantity=Integer.pasrdeInt(JOptionPane.showImputDialog("Enter quantity"));
    JOptionPane.showMessageDialog(null,"PURCHASE ORDER: \n\n" + "Item: "+itemName+ "\nPrice"+price+ "\nQuantity: " +quantity + "\nTotal $" + price*quantity);
  }//end main
}//end class PrintPurchaseOrderGui
