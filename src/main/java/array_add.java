public class array_add {
    public static void main(String args[]){
        int [][] a = {{2,74,9,1},{5,2,16,11}};
        int [][] b = {{81,5,2,9},{18,5,72,90}};
        int [][] sum = new int[2][4];

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        for(int n[] : sum){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
