class C{
    public C(){
        System.out.println("Object Created");
    }
    public void show(){
        System.out.println("Show method called");
    }
}


public class anonobj {
    public static void main(String[] args) {
        new C().show(); // Anonymouse object where the object haven't assigned into in a refernce variable in stack
        new C().show();// No. of time this will be called , no of object , it will create in heap
    }
}
