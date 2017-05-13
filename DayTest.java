
import java.util.Scanner;

/*
 * Program to print Day name when user enter Day number.
 * @author Eyad AL-‘Amawi
 */
public class DayTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Day Number: ");
        String dayName = "";
        if (in.hasNextInt()) {

            int dayNumber = in.nextInt();
            if (dayNumber >= 1 && dayNumber <= 7) {

                switch (dayNumber) {
                    case 1:
                        dayName = "Saturday";
                        break;
                    case 2:
                        dayName = "Sunday";
                        break;
                    case 3:
                        dayName = "Monday";
                        break;
                    case 4:
                        dayName = "Tuesday";
                        break;
                    case 5:
                        dayName = "Wednesday";
                        break;
                    case 6:
                        dayName = "Thursday";
                        break;
                    case 7:
                        dayName = "Friday";
                        break;

                }
                System.out.println(dayName);
            } else {
                System.out.println("Invalid value!");
            }

        } else {
            System.out.println("Invalid value!");
        }

    }

}
