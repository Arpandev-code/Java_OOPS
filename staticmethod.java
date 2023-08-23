class Mobile{
    static String brand;
    int price;
    String name;
    public static void show(Mobile obj1){
        // System.out.println(brand +" : "+price+" : "+name);
        //you can't use non-static variable inside of static method directly but indirectly it's possible
         System.out.println(brand +" : "+obj1.price+" : "+obj1.name);
    }
}


public class staticmethod {
    public static void main(String[] args) {
    /*
     why main method is static?
     If main method was not static then we have to create a object of staticmethod
     class then we can call main method but the program starting point is main method
     Soo how can i create a object !!the program will be in deadlock
     */
        Mobile.brand="Jio";
        
        Mobile obj1=new Mobile();
        obj1.price=999;
        obj1.name="Jio Phone";
        
        Mobile obj2=new Mobile();
        obj2.price=2000;
        obj2.name="Jio Phone 2";

        Mobile.show(obj1);
    }
}
