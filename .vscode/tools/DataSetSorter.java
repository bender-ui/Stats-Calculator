import java.util.Scanner;

public class DataSetSorter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIs the data set a population of sample (p/s): ");
        String type = scanner.nextLine();

        sort s = new sort();
        sample_standard_deviation sample = new sample_standard_deviation();
        population_standard_deviation population = new population_standard_deviation();

        if (type.equals("p")) {
            System.out.print("\nEnter the popualtion: ");
            String string = scanner.nextLine();
            double[] popStr = s.sortString(string);
            population.popualtionST(popStr);

        }
        if (type.equals("s")) {
            System.out.print("\nEnter the sample: ");
            String string = scanner.nextLine();
            double[] samStr = s.sortString(string);
            sample.sampleST(samStr);
        }
        scanner.close();

    }

}
