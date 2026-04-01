// package DP_problem;

public class Contest22 {

    public static boolean canMakeAllEvenOrOdd(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int evenCount = 0;
        int oddCount = 0;
        for (int num : nums) {
            if ((num & 1) == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // If all are already even or all are already odd, it's trivially possible.
        if (evenCount == 0 || oddCount == 0) {
            return true;
        }

        // For target = all odd, each even element can be converted using any odd partner (i != j).
        // As long as oddCount >= 1, this is possible for every even.
        // For target = all even, each odd element needs another odd partner (i != j), so oddCount >= 2.
        return oddCount >= 1;
    }

    public static void main(String[] args) {
         
        int[][] nums={
            {1, 0, 3},
            {2, 4, 6},
            {1, 3, 5},
            {1, 0, 4}
        };

        boolean[] row = new boolean[nums.length];
        boolean[] col = new boolean[nums[0].length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (nums[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(row[i] || col[j]){
                    nums[i][j]=0;
                }
            }
        }

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        
        System.out.println(24690%12345);
    }
}