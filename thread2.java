/*
Multiple Inheritance is not supported by Java. So, extending a thread is not a good practice to follow.
Thread is a class that implements Runnable and Runnable contains a method known as the run() method.
Instead of extending a thread, we can also implement it through an interface called Runnable.
 */

public class thread2 {
    public static void main(String[] args) {
        // As Runnable is a functional interface so we can use of Lambda Expression 
        Runnable obj1=() ->
        {
                for(int i=0;i<=10;i++){
                    System.out.println("Hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                
                }  
        }; 
        Runnable obj2=() ->
        {
            for(int i=0;i<=10;i++){
                    System.out.println("Hello");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                
                }  
        };
        // As Runnable is a functional interface it has only run() method 
        // but to call the run( method ) i.e. start the Thread we need to call strat() method
        // So We need to craete a object of Thread class & Pass the object of Interface class to call the start method 
        //or we can say to start the thread 
        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);

        t1.start();
        t2.start();
    }
}
