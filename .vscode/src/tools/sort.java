package tools;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args){
        System.out.println("TESTING SORT");
        test();
    }
    public String[] sortString(String inputStr){
        
        try{
            String[] parts = inputStr.split(", ");
            return parts;
        } catch (NumberFormatException e) {
            System.err.println("Bad Input");
            String[] nun = new String['0'];
            return nun;
        }
    }

    public static void test(){
        Sort sorted = new Sort();
        String[] expected = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        System.out.println("\n[TEST 1] Passing: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10");
        String[] test1 = sorted.sortString("1, 2, 3, 4, 5, 6, 7, 8, 9, 10");
        if (Arrays.equals(test1, expected)) {
            System.out.println("[TEST 1] PASSED");
        } 
        else{
            System.out.println("[TEST 1] FAILED");
            System.out.println("GOT: " + Arrays.toString(test1));
        }

        System.out.println("\n[TEST 2] Passing: 1,2,3,4,5,6,7,8,9,10"); //Edge case
        String[] test2 = sorted.sortString("1,2,3,4,5,6,7,8,9,10");
        if (Arrays.equals(test2, expected)) {
            System.out.println("[TEST 2] PASSED");
        } 
        else{
            System.out.println("[TEST 2] FAILED");
            System.out.println("GOT: " + Arrays.toString(test2));
        }

        System.out.println("\n[TEST 3] Passing: 1 2 3 4 5 6 7 8 9 10"); //Edge case
        String[] test3 = sorted.sortString("1 2 3 4 5 6 7 8 9 10");
        if (Arrays.equals(test3, expected)) {
            System.out.println("[TEST 3] PASSED");

        } 
        else{
            System.out.println("[TEST 3] FAILED");
            System.out.println("GOT: " + Arrays.toString(test3));
        }

        System.out.println("\n[TEST 4] Passing: 1, , , 2, , , 3, , , 4, , , 5, , , 6, , , 7, , , 8, , , 9, , , 10"); //Edge case
        String[] test4 = sorted.sortString("1, , , 2, , , 3, , , 4, , , 5, , , 6, , , 7, , , 8, , , 9, , , 10");
        if (Arrays.equals(test4, expected)) {
            System.out.println("[TEST 4] PASSED");
        } 
        else{
            System.out.println("[TEST 4] FAILED");
            System.out.println("GOT: " + Arrays.toString(test4));
        }

        System.out.println("\n[TEST 5] Passing: 1, 2, 3, 4, 5, 6, 7, 8, 9, a"); //Edge case
        String[] test5 = sorted.sortString("1, 2, 3, 4, 5, 6, 7, 8, 9, a");
        if (Arrays.equals(test5, expected)) {
            System.out.println("[TEST 5] PASSED");
        } 
        else{
            System.out.println("[TEST 5] FAILED");
            System.out.println("GOT: " + Arrays.toString(test5));
        }
    }
}
