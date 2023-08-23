class Mobile{
    static String brand;
/*Static Variable:
For Static variable there is differnt location in JVM to store. Which is refered to all the objects. Static is a class member not a object member
*/
    int price;
    String name;
    public void show(){
        System.out.println(brand +" : "+price+" : "+name);
    }

}


public class staticvariable {
    public static void main(String[] args) {
        Mobile.brand="Jio";
        
        Mobile obj1=new Mobile();
        obj1.price=999;
        obj1.name="Jio Phone";
        
        Mobile obj2=new Mobile();
        obj2.price=2000;
        obj2.name="Jio Phone 2";

        obj1.show();
        obj2.show();

    }
}
