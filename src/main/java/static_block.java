
class mobile{
    String brand;
    int price;
    static String name;
    static {
        name = "phone";
        System.out.println("static block");
    }

    public mobile(){
        brand = "";
        price =200;
        System.out.println("in the constructor");
    }
    public void show3(){
        System.out.println(brand + " : " +price + " : " + name);
    }


}
public class static_block {
    public static void main(String args[]) {
        mobile obj1 = new mobile();
        obj1.brand = "Apple";
        obj1.price = 2000;
        obj1.name = "Smartphone";

        mobile obj2 = new mobile();

        }

    }