/********************
DaysInMonth.java

Isabel Rodriguez Gonzalez
This program finds the number of days in a month
********************/
import javax.swing.JOptionPane;
public class DaysInMonth{
  public static void main(String[]args){
    int numberOfDaysInAMonth = 0;
    int leapYearOrNonLeapYear;
    String monthOfYear;

    monthOfYear = JOptionPane.showInputDialog("Enter your month");

    switch(monthOfYear){
      case "January":
        numberOfDaysInAMonth = 31;
        break;
      case "February":
        if ((leapYearOrNonLeapYear % 4 == 0) && ((leapYearOrNonLeapYear % 100 != 0) || (leapYearOrNonLeapYear % 400 == 0)));
        break;
      case "March":
        numberOfDaysInAMonth = 31;
        break;
      case "April":
        numberOfDaysInAMonth = 30;
        break;
      case "May":
        numberOfDaysInAMonth = 31;
        break;
      case "June":
        numberOfDaysInAMonth = 30;
        break;
      case "July":
        numberOfDaysInAMonth = 31;
        break;
      case "August":
        numberOfDaysInAMonth = 31;
        break;
      case "September":
        numberOfDaysInAMonth = 30;
        break;
      case "October":
        numberOfDaysInAMonth = 31;
        break;
      case "November":
        numberOfDaysInAMonth = 30;
        break;
      case "December":
        numberOfDaysInAMonth = 31;
        break;
        }//end switch
  }
}
