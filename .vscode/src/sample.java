package .vscode;

public class sample {
    public void sampleA(double[] sample, int length, double average) {
        int i = 0;
        double sum = 0;
    
        while (i < length) {
            sum += ((sample[i] - average) * (sample[i] - average));
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