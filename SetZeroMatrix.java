public class SetZeroMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{1,2,0,1},{0,1,1,0}};

        int num[][]=new int[arr.length][arr[0].length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
               num[i][j]=arr[i][j];

            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    for(int k=0;k<arr.length;k++){
                        num[k][j]=0;
                    }
                    for(int k=0;k<arr[0].length;k++){
                        num[i][k]=0;
                    }
                }

            }
        }

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[0].length;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();

        }

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[0].length;j++){
                arr[i][j]=num[i][j];
            }
            // System.out.println();

        }
        System.out.println();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

        

        
    }
}
