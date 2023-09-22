interface Gmap{
    String name="Arpandev"; //final & static by defult
    void goForward();
    void moveLeft();
    void moveRight();
}
class Me implements Gmap{
    public void goForward(){
        System.out.println("Going Forward...");
    }
    public void moveLeft(){
        System.out.println("Moving Left");
    }
    public void moveRight(){
        System.out.println("Moving Right");
    }
}
/*
Soo if we take a example : Interface Gmap is giving me direction( abstrct methods )
i have to implement the direction(means i have to go, gmap giving me the direction) 
 
 */




public class interface1 {
    public static void main(String[] args) {
        Me obj=new Me();
        obj.goForward();
        obj.moveLeft();
        obj.moveRight();
        System.out.println(Gmap.name);//the variable inside of Gmap interface is static that's why we don't need to create object to acess the variable
    }
}
