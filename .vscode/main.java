import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Is the data set a population of sample (p/s): ");
        String type = scanner.nextLine();

        sort a = new sort();

        if (type == "p") {
            System.out.print("Enter the popualtion: ");
            String string = scanner.nextLine();

        }
        if (type == "s") {
            System.out.print("Enter the sample: ");
            String string = scanner.nextLine();

        }
        scanner.close();

 

    }

}

