import javax.swing.*;
public class implementGeometricObjects{
  public static void main(String[] args) {
    Circle circlelito=new Circle(3.5, "Blue", true);
    /*
    JOptionPane.showMessageDialog(null, "The area is "+ circlelito.getArea());
      JOptionPane.showMessageDialog(null, "The circle was created on " + circlelito.getDateCreated());

      Rectangle rectanglelito=new Rectangle(10, 20, "Red", true);
      JOptionPane.showMessageDialog(null, "The area is"+rectanglelito.getArea());
      JOptionPane.showMessageDialog(null, "The perimeter is "+rectanglelito.getPerimeter());
      JOptionPane.showMessageDialog(null, "The rectangle was created on "+rectanglelito.getDateCreated());
      */
      //polimorfismo
      JOptionPane.showMessageDialog(null, circlelito.toString());
  }
}
