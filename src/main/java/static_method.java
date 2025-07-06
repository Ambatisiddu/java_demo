class Mobile1{
        String brand;
        int price;
        static String name;

        public static void show1(Mobile1 obje){
            System.out.println(obje.brand + " : " +obje.price + " : " + name);
        }
    }
public class static_method {
        public static void main(String args[]){
            Mobile1 obje1 = new Mobile1();
            obje1.brand = "Apple";
            obje1.price = 1500;
            obje1.name = "phone";

            Mobile1 obje2 = new Mobile1();
            obje2.brand = "Samsung";
            obje2.price = 1700;
            obje2.name = "phone";

            obje1.name = "SmartMobiles";

            Mobile1.show1(obje1);
            Mobile1.show1(obje2);
        }

    }

