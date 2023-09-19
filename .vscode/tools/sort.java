
public class sort {
    public static void main(String args[]) {
        System.out.println(args);
    }

    public double[] sortString(String inputStr) {

        try {
            String[] parts = inputStr.split(", ");
            double[] sorted = new double[parts.length];

            int i = 0;
            for (String str : parts) {
                double temp = Double.parseDouble(str);
                sorted[i] = temp;
                i++;

            }

            return sorted;

        } catch (NumberFormatException e) {
            System.out.println("Bad input: " + e.getMessage());
            double[] nun = new double[0];
            return nun;
        }
    }
}
