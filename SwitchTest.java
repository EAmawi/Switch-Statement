
import java.util.Scanner;
/**
 * switch statement example
 * @author Eyad AL-‘Amawi
 */
public class SwitchTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String monthString = "";
        if (in.hasNextInt()) {
            int month = in.nextInt();
            if (month <= 12 && month >= 1) {
                switch (month) {
                    case 1:
                        monthString = "January";
                        break;
                    case 2:
                        monthString = "February";
                        break;
                    case 3:
                        monthString = "March";
                        break;
                    case 4:
                        monthString = "April";
                        break;
                    case 5:
                        monthString = "May";
                        break;
                    case 6:
                        monthString = "June";
                        break;
                    case 7:
                        monthString = "July";
                        break;
                    case 8:
                        monthString = "August";
                        break;
                    case 9:
                        monthString = "September";
                        break;
                    case 10:
                        monthString = "October";
                        break;
                    case 11:
                        monthString = "November";
                        break;
                    case 12:
                        monthString = "December";
                        break;

                }
            } else {
                System.out.println("Invalid value!");
            }
        } else {
            System.out.println("Invalid value!");
        }
        System.out.println(monthString);
    }

}
