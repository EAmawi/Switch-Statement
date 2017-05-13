
import java.util.Scanner;

/* 
 * Program to print Month name when user enter Month number.
 * @author Eyad AL-‘Amawi
 */
public class MonthTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Month Number: ");
        String monthName = "";
        if (in.hasNextInt()) {

            int monthNumber = in.nextInt();
            if (monthNumber >= 1 && monthNumber <= 12) {

                switch (monthNumber) {
                    case 1:
                        monthName = "January ";
                        break;
                    case 2:
                        monthName = "February";
                        break;
                    case 3:
                        monthName = "March";
                        break;
                    case 4:
                        monthName = "April";
                        break;
                    case 5:
                        monthName = "May";
                        break;
                    case 6:
                        monthName = "June";
                        break;
                    case 7:
                        monthName = "July";
                        break;
                    case 8:
                        monthName = "August";
                        break;
                    case 9:
                        monthName = "September";
                        break;
                    case 10:
                        monthName = "October";
                        break;
                    case 11:
                        monthName = "November";
                        break;
                    case 12:
                        monthName = "December";
                        break;

                }
                System.out.println(monthName);
            } else {
                System.out.println("Invalid value!");
            }

        } else {
            System.out.println("Invalid value!");
        }

    }

}
