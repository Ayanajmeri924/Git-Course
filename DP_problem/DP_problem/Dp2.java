
package DP_problem;
public class Dp2 {
    public static void main(String[] args) {
         String s1="a";
        String s2="at";

        int m=s1.length();
        int n=s2.length();

        int dp[][]=new int[m+1][n+1];
     

        
        // Initialize first column: delete all characters from s1[0...i-1]
        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
        }
      
        // Initialize first row: delete all characters from s2[0...j-1]
        for (int j = 1; j <= n; j++) {
            dp[0][j] = dp[0][j - 1] + s2.charAt(j - 1);
        }
      
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                // char a=s1.charAt(i-1);
                // char b=s2.charAt(j-1);
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                    // sb=sb.append(s1.charAt(i-1));
                }else{
                    dp[i][j]=Math.min(dp[i-1][j]+s1.charAt(i-1),dp[i][j-1]+s2.charAt(j-1));
                    // sb=sb.append(dp[i][j]);
                    // sb=sb.append(s1.charAt(i-1));


                }
            }

        }

        System.out.println("\nNew line\n ");
        
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nAnswer\n");

        System.out.println(dp[m][n]);

    }

}
