public class population_standard_deviation {

    public void popualtionST(double[] sample) {
        int i = 0;
        double total = 0;
        double sum = 0;
        int length = sample.length;

        for (double num : sample) {
            total += num;
        }
        double average = total / length;

        while (i < length) {
            sum += ((sample[i] - average) * (sample[i] - average));
            i++;
        }
        double awnser = Math.sqrt(sum / length);

        System.out.println("\nStandard Deviation = " + awnser);

        System.out.println("Mean               = " + average);
    }
}
