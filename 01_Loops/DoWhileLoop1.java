public class DoWhileLoop1 {
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println("hi"+i);
            i++;
        }while(i<=4);
    }
    /*
     So let's see what's the differance between while & DoWhile, While exicutes only if the
     condition is true, but in case of Dowhile even if the condition isn't true the code will exicutes atleast once.
     For example : Suppose you're sending a msg to your friend even if he isn't avilable , the msg can be send by you atleast once then
     it will show user unavialble error msg or some error code
     */
}
