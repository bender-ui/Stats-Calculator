
public class sort {
    public static void main(String args[]) {
        System.out.println(args);
    }

    public String[] sortString(String inputStr) {

        try {
            String[] parts = inputStr.split(", ");
            return parts;
        } catch (NumberFormatException e) {
            System.err.println("Bad input: " + e.getMessage());
            String[] nun = new String['0'];
            return nun;
        }
    }
}
