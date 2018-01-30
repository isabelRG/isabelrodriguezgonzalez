/***********
Isabel Rodriguez Gonzalez
PrinPurchaseOrderGui.java

This program calculates and prints a purchase arder report
*****************/
import javax.swing.JOptionPane;

public class PrintPurchaseOsderGui{
  public static void main(String[]args){
    String itemName; //name of purchase item
    double price; //price of purchase item
    int quantity; //number of items purchase
    itemName = JOptionPane.showInputDialog("Enetre name of purchase item");
    price = Double.parseDouble(JOptionPane.showInputDialog("Enter price of one item"));
    quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity"));
    JOptionPane.showMessageDialog(null,"PURCHASE ORDER: \n\n" + "Item: "+ itemName + "\nPrice"+price+ "\nQuantity: " + quantity + "\nTotal $" + price * quantity );
  }//end main
}//end class PrintPurchaseOrderGui
