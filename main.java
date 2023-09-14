import java.util.Arrays;
import java.lang.Math;

class GFG {
    public static void main(String args[]) {

        double[] arr = { 58.8, 59.9, 60.7, 59.0, 55.9, 56.5, 54.4, 60.6, 62.1, 59.9, 57.1, 58.9, 58.1, 56.6, 55.2, 57.7,
                55.8, 56.2, 57.9, 56.5 };
        int length = arr.length;
        double[] sample = new double[length];
        Arrays.sort(arr);

        double total = 0;

        System.out.println("\nThe sorted array is: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + ", ");
            sample[i] = arr[i];
            total += arr[i];
        }

        double average = total / arr.length;

        System.out.println("\n\nTotal         = " + total);
        System.out.println("Sample Size   = " + length);

        ;

        int i = 0;
        double sum = 0;

        while (i < length) {
            sum += ((arr[i] - average) * (arr[i] - average));
            i++;
        }

        double dev = Math.sqrt(sum / (length - 1));

        System.out.println("\nStandard Deviation = " + dev);

        System.out.println("Mean               = " + average);
        if (length % 2 == 0) {
            double med = (sample[(length / 2) - 1] + sample[length / 2]) / 2;
            System.out.println("Median             = " + med);
        } else {
            System.out.println("Median");
        }

    }

}