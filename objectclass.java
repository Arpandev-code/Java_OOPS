class HI extends Object{
 int price;
 String model;
  public String toString(){
    return model+ ":" +price;
  }
    
}


public class objectclass {
    public static void main(String[] args) {
        HI obj1= new HI();
        obj1.model="HP-Victus";
        obj1.price=60000;
        
        HI obj2= new HI();
        obj2.model="HP-Victus";
        obj2.price=60000;

        boolean result=obj1.equals(obj2);

        System.out.println(result);
        //output is: False cuz even if the objects are same but the hashcode for those aren't same
        



        // System.out.println(obj);
        // System.out.println(obj.toString());
        //both gives same output
        /*
         Output- HI@5acf9800
         by defult it's calling the toString method which is defined inside of object
         class.
         HI is the class name , 5acf9800-> its a hashcode in hexadecimal formate
         */
    }
}
