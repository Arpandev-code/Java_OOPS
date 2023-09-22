/*
 if you want to store integer value you store in int.
java provide primitive data type 
thats why java is 99.9 % object oriented programming
primitive data types helps us to improve the performance 
but certain feature are work only when we work with objects
for collection framework -- we need non primitive type data as input 
*/


public class wrapperclass {
    public static void main(String[] args) {

        int num=7;
        //Integer num1= new Integer(8);//Boxing
        /*
         The constructor Integer(int) has been deprecated since version 9 and marked for removal. that's why the cut sign
         */
        Integer num1=8;//Boxing
        //Boxing->It is manual method to convert primitive type data into non-primitivetype .

       // int num2= num1.intValue();//unboxing
       //Unboxing->It is manual method to convert non-primitive data type to primitive type.
       int num2 =num1;//Autoboxing
       //Autoboxing-> it is a automatic convertion of the non-primitive data type to premitive data type
        System.out.println(num2);
        
        //Converting String to integar
        String str= "7";
        int num4=Integer.parseInt(str);
         System.out.println(num4);

        //Converting int to string
        int num3=7;
        String str1=Integer.toString(num3);
        System.out.println(str1);


    

        
    }
}
