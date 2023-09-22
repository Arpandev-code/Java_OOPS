class A{
    public void show(){
        System.out.println("In A show");
    }

}
class B extends A{
     public void show(){
        System.out.println("In B show");
    }
}
class C extends A{
     public void show(){
        System.out.println("In C show");
    }

}





public class dynamicmethoddispatch {
    public static void main(String[] args) {
        /* implementation of runtime polymorphish
        we can see show() method showing diffent behavior for differnt 
        object in runtime .
        
        */
        A obj=new A();
        obj.show();

        obj=new B();
        obj.show();

        obj=new C();
        obj.show();
    }
    
}
