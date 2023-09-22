class A{
    public void show(){
        System.out.println("In A");
    }
}
class B extends A{
    public void show1(){
        System.out.println("In B");
    }
}

public class downandupcastinginoops {
    public static void main(String[] args) {
        A obj =new A();// we are creating object of A, & the type of object is A
        obj.show();
        // obj.shwo1(); It will throw a compile time error cuz A don't know about the 
        // B class under which show1() method is defined
        

    }
}
