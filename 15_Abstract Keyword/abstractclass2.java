abstract class Anno{
   abstract public void lol();
}





public class abstractclass2 {
   public static void main(String[] args) {

    Anno obj= new Anno(){ 
        /*
         Acually we are creating the the object of 
         Anonymus Inner class , not of Anno class here!
         */
        public void lol(){
            System.out.println("In new");
        }
    };

    
   } 
}
