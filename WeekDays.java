/**************
WeekDays.java
Isabel Rodriguez Gonzalez
Crea una aplicacion que nos pida un dia de la semana y que nos diga si es un dia laboral o no.
 Usa un switch para ello.
**************/
import javax.swing.JOptionPane;
public class WeekDays{
  public static void main(String[] args) {
    String dia;
    dia=JOptionPane.showInputDialog("Ingrese un dia");
    switch(dia){
      case "Lunes":
      JOptionPane.showMessageDialog(null,dia+" Es un dia laboral");
      break;
      case "Martes":
      JOptionPane.showMessageDialog(null,dia+" Es un dia laboral");
      break;
      case "Miercoles":
      JOptionPane.showMessageDialog(null,dia+" Es un dia laboral");
      break;
      case "Jueves":
      JOptionPane.showMessageDialog(null,dia+" Es un dia laboral");
      break;
      case "Viernes":
      JOptionPane.showMessageDialog(null,dia+" Es un dia laboral");
      break;
      case "Sabado":
      JOptionPane.showMessageDialog(null,dia+" Es no un dia laboral");
      break;
      case "Domingo":
      JOptionPane.showMessageDialog(null,dia+" Es no un dia laboral");
      break;
      default:
      JOptionPane.showMessageDialog(null,dia+" Es una option incorrecta");
      break;
    }
  }
}
