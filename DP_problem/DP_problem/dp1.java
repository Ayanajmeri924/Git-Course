package DP_problem;

public class dp1 {
    public static void main(String[] args) {

        //Problem: Longest common subsequence(LeetCode problem)
        String s1="ayana";
        String s2="sohana";

        int m=s1.length();
        int n=s2.length();

        int dp[][]=new int[m+1][n+1];
        // StringBuilder sb=new StringBuilder();

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    // sb=sb.append(s1.charAt(i-1));
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    // sb=sb.append(dp[i][j]);
                    // sb=sb.append(s1.charAt(i-1));


                }
            }

        }


        System.out.println(dp[m][n]);
        // System.out.println(sb);


    }
}
