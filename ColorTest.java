
import java.util.Scanner;

/*
 * Program to print if the color that user enters it is from Main Colors or not.
 * @author Eyad AL-‘Amawi
 */
public class ColorTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter color name : ");

        String ColorName = in.next().toLowerCase();

        switch (ColorName) {
            case "red":
            case "green":
            case "blue":
                System.out.println("This from Main Colors");
                break;
            default:
                System.out.println("This NOT from Main Colors");

        }

    }

}
