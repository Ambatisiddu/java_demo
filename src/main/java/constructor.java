class Calculator
{
    public int add()
    {

        System.out.println("Constructor without parameter");
        return 0;
    }

}

public class constructor {
    public static void main(String args[]){
        Calculator calc = new Calculator();
        int result = calc.add();
        System.out.println(result);
    }
}
