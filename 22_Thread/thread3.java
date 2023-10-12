/*
 Threads are useful when you want to execute multiple things at the same time.
- Most of the time, threads are created by the framework itself.
- Threads are used when you want to make things faster.
-------------------------------------------------------------------------------
Mutations simply mean that you can change something.
- Primitive type variables and primitive type objects are mutations as their value can be changed.
- Strings are immutable as we cannot change their value of it.
----------------------------------------------------------------------------------------------
So here the problem is Use of threads and mutations at the same time is not good, as it creates instability in the code.
Soo 2 or more threads are working on same method or mutations, Let's explain with IRL scenario
Suppose you have two Debite card of a bank(Balance-10,000/-)(Not possible irl). you gave your 1 Debit card to
your friend. One day you & your friend wanted to withdrawl 7000 from a atm at same time & same second but the account balance is 10,000
So it raise a problem , This is basically called race condition.
----------------------------------------------------------------------------
Thread Safe:
Thread safe means that only one thread will work at one point.
When a thread is already working on an object and preventing another thread 
from working on the same object, this process is called Thread-Safety.


*/

/*
 If both threads go to the method at the same time then it might be possible that they will be lost some of the values in between.
- The above problem will be resolved by using the synchronized keyword.
- By using the synchronized, java ensures that the method will be called by only one Thread at a time to handle instability in code.
- So, if a thread is working with the synchronized method, then the other thread has to wait to work with that method until the first thread gets completed.
- Synchronization in java is the capability to control the access of multiple threads to any shared resource. 
 */


class Counter{
    int count;
   public synchronized void increment(){
        count++;
    }
}




public class thread3 {
    public static void main(String[] args) {
        Counter c= new Counter();

        Runnable obj2=() ->
        {
                for(int i=1;i<=1000;i++){
                   c.increment();
                
                }  
        }; 
        Runnable obj3=() ->
        {
                for(int i=1;i<=1000;i++){
                   c.increment();
                
                }  
        }; 
        Thread t1= new Thread(obj2);
        Thread t2= new Thread(obj3);
        t1.start();
        t2.start();
        /*
If we have two threads and each thread is calling increment thousand times, then increment will be called two thousand times.
- For the above case, every time you run the code you will get a different output for this.
This happens because the main method prints the value of the count at any moment of time, it does not wait for threads to \
execute completely and come back to the main method.
If the main method waits for threads to execute and to come back after completion, 
then it gives nearby correct output.
join() is a method that allows the main method to wait for the other threads to come back and join.

         */
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println(c.count);
    }
}
/*
 Let me explain join() in more intersting way, So suppose you Two Thread Friends study in same school
 Suppose t1's class is over but t2 still in class, As t1 is good friend so he will wait until t2 finsh his class 
 so there t2.join() method called while t1 is in waiting state.  while t1 waiting t1's girlfriend came
 asking t1 for a coffie then t1 starts to exicute some other task here a interruptedException(checked Exception) occours so we have handle it
 

 */
