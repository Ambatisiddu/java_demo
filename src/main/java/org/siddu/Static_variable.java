package org.siddu;

class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}
public class Static_variable {
    public static void main(String args[]){
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "phone";

        Mobile.name = "Smartphone";  //we set name as static variable so they should be same value.
                                    //because of this condition name became smartphone for everywhere.

        obj1.show();
        obj2.show();
    }

}
