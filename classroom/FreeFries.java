/*****************
FreeFries.java

Isabel Rodriguez Gonzalez
This program reads points scored by home team and the opposing team and determines IF the fans win free
*****************/
import javax.swing.JOptionPane;//para utilizar mdo grafico GUI

public class FreeFries{
  public static void main(String[] args){
    int homePoints;//points scored by home team
    int opponentPoints;//points scored by opposing team

    homePoints=Integer.parseInt(JOptionPane.showInputDialog("Enter home points"));
    opponentPoints=Integer.parseInt(JOptionPane.showInputDialog("Enter home points"));

    if ( homePoints > opponentPoints && homePoints >= 100 ){
      JOptionPane.showInputDialog(null, "A free order of French Fries for White Tigers Fans" );
    }//end if
  }  //end main
}  //end class FreeFries
