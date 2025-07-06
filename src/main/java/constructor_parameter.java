class parameter{
    public int sub(int n1, int n2){
        int r = n1 - n2;
        return r;
    }
}


public class constructor_parameter {
    public static void main(String args[]){
        int n1 = 2;
        int n2 = 6;
        parameter p1 = new parameter();
        int result = p1.sub(257, 32);
        System.out.println(result);
    }


}
