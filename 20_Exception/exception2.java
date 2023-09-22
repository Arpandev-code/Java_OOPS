

public class exception2 {
    public static void main(String[] args) {
    int i=2;
    int j=0;
    int [] arr={1,2,3,4,5};

    try{
        j=18/i;
        System.out.println(arr[10]);

    }
    catch(ArithmeticException e)
    {
        System.out.println("i Value can't be zero");
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Limit ke bahar mat ja");
    }
    catch (Exception e)
    {
        System.out.println("Something went wrong");
    }
    System.out.println("Bye");

    } 
    //Exception is the super class !
    
}
/*
 int a = 10;
int arr[]={3,4,5};
try{
   int b = 3/a;
   System.out.println(arr[b]);
}
catch(Exception e){
   System.out.print("parent class of every exception");
}
catch(ArithmeticException e){
 }

-- this will give compile time error i.e error: exception 
ArithmeticException has already been caught by Exception class
 */
/*
                        Object(Every class in java extends object class)
                           |
                        Throwable(Note: 'able' at the last of the word means that is interface but here its a class only)
                           |
            ________________________________________________________________________________  
            |                                                                               |                          
            Error                                                                       Exceptions
    __________|_____________________________________                                 __________|_____________________________________________________________________________________                              
    |               |                   |           |                               |                                                                              |            |
ThreadDead   VirtualMemoryError      IO Error   OutOfMemoryError            RuntimeExpetion(checked Expection Compilar don't care if you catch exception)    SQLExpection   IOExpections   
                                                                ____________________|_______________________  
                                                                |                   |                       |
                                                            ArithmethicException ArrayIndexOutOfBound    NullPointerException                

                                            
 */
