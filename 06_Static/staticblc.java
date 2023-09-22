class Mobile{
    static String brand;
    int price;
    String name;

    static{
        brand="Jio";
        System.out.println("Static method");
    }

    public Mobile(){
        name="";
        price=90;
    System.out.println("Constructor");
    }
    
    public void show1(){
        System.out.println(brand +" : "+price+" : "+name);
    }
}

public class staticblc {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobile");
        // Mobile obj1=new Mobile();
        // obj1.price=999;
        // obj1.name="Jio Phone";
        
        // Mobile obj2=new Mobile();
       
    }
}
