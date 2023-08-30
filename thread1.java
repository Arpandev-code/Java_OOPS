/*
Thread Notes:
 #1
- When you run an application, the software that you have written will be running on an OS( Operating System).
- Below the OS, a layer is present that is known as Hardware.
- Software will always run on hardware.
- Hardware consists of:
    RAM - acts as a temporary memory for processing
    CPU - that executes something (processing done here)
- OS supports multiple software working at the same time and it means it supports Multitasking.
- Multitasking:
Multitasking is the ability of the CPU to perform multiple tasks simultaneously. There will be continuous context switching of the CPU between the tasks.
- CPU has a concept of time sharing which means each process runs for some short period of time one by one. The software runs parallelly by sharing the time in the CPU. 
 */

 /*
 We can also divide our tasks into small units.
- In the same task or a program, we can have multiple threads running at the same time.
- Thread is light-weight and it is the smallest unit of a task. 
 Suppose in VS Code editor if write some wrong keyword using keyboard it shows in the editor
 as well it shows the a Error redline with a Error msg if we hover on it! So here what's happeing
 is in VS code software every task divied into smaller task which work simultaneously that each smallest units are called thread

 */
class OMG extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class OMG1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello");
              try {
                Thread.sleep(10);
                //Thread will wait by using the sleep() method.
                //Sleep() method will throw an interrupted exception. So, we can handle an exception by using the try-catch block.
                //When we use sleep(), then the thread goes into the waiting state.

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
/*
 run() & start()
 in thraeds class these methods are pre defind
 Suppose in a racing game , participents are in there own track to start running(Run Method)
 A rac starter will fire a bullet to the sky (start method), Like that to start the thread
 call the start() method which is created by extending Thread class & run method 
 */


public class thread1 {
    public static void main(String[] args) {
       OMG obj1=new OMG();
       OMG1 obj2=new OMG1();
       obj1.start();
       try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
       /*
        We cannot control the schedular, we can only give suggestions to it to give priority.
        Different schedulers have different algorithms to work upon so by giving priority, we can only give suggestions to it. 
        It might be possible that the scheduler gives the highest priority to the process that will execute in less time at the running phase.

        */
      //setting the priority of obj2 to high thread where 1 is low, 5 is normal , 10 is High
       obj2.setPriority(Thread.MAX_PRIORITY);
       //get the priority of the thread where 1 is low, 5 is normal , 10 is High
        System.out.println(obj2.getPriority());
       obj2.start();
    }

}
// Note: We can't control schedular, We can just optimize the code the using various method 