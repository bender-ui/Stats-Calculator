public class test_tools {
    public static void main(String args[]){

        sort sorted = new sort();
        String[] expected = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        System.out.println("[TEST 1] Passing: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10");
        if (sorted.sortString("1, 2, 3, 4, 5, 6, 7, 8, 9, 10") == expected) {
            System.out.println("[TEST 1] PASSED");
        } 
        else{
            System.out.println("[TEST 1] FAILED");
        }
        
        System.out.println("[TEST 2] Passing: 1,2,3,4,5,6,7,8,9,10");
        if (sorted.sortString("1,2,3,4,5,6,7,8,9,10") == expected) {
            System.out.println("[TEST 2] PASSED");
        } 
        else{
            System.out.println("[TEST 2] FAILED");
        }

        System.out.println("[TEST 3] Passing: 1 2 3 4 5 6 7 8 9 10");
        if (sorted.sortString("1 2 3 4 5 6 7 8 9 10") == expected) {
            System.out.println("[TEST 3] PASSED");
        } 
        else{
            System.out.println("[TEST 3] FAILED");
        }

        System.out.println("[TEST 4] Passing: 1, , , 2, , , 3, , , 4, , , 5, , , 6, , , 7, , , 8, , , 9, , , 10");
        if (sorted.sortString("1, , , 2, , , 3, , , 4, , , 5, , , 6, , , 7, , , 8, , , 9, , , 10") == expected) {
            System.out.println("[TEST 4] PASSED");
        } 
        else{
            System.out.println("[TEST 4] FAILED");
        }

        System.out.println("[TEST 5] Passing: 1, 2, 3, 4, 5, 6, 7, 8, 9, a");
        if (sorted.sortString("1, 2, 3, 4, 5, 6, 7, 8, 9, a") == expected) {
            System.out.println("[TEST 5] PASSED");
        } 
        else{
            System.out.println("[TEST 5] FAILED");
        }
        
    }//Main close
} //Class close
