class Leet1975{
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{-1,-2,-3},{1,2,3}};
        long sum=0;
        long negC=0;
        long maxNeg=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                // System.out.print(matrix[i][j]+" ");
                int absVal=Math.abs(matrix[i][j]);
                sum+=absVal;
                if(matrix[i][j]<0){
                    negC++;
                }
                maxNeg=Math.min(maxNeg,absVal);

            }
            System.out.println(sum);
            // System.out.println();
        }
        System.out.println(negC);
        System.out.println(maxNeg);

        if(negC%2==0){
            System.out.println(sum);
        }else{
            System.out.println(sum-maxNeg*2L);
        }

    }
}