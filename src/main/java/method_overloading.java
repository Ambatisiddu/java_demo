
class Overloading{
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public double add(double n1, double n2){
        return n1 + n2;
    }


}
public class method_overloading {
    public static void main(String args[]){
        Overloading obj = new Overloading();
        int result = obj.add(3, 7, 6);
        System.out.println(result);
    }

}
