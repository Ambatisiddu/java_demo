public class three_dimentional_array {
        public static void main(String args[]){
            int nums[][][] = new int [3][4][2];   //3_dimentional_array

            for(int i=0; i<3; i++){
                for (int j=0; j<4; j++){
                    for(int z=0; z<2; z++){
                        nums[i][j][z] = (int)(Math.random() * 10);

                    }
                }
            }
            for( int n[][]: nums){
                for(int m[] : n){
                    for(int s : m){
                        System.out.print(s + " ");
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

}
