class Wa1{
    public void show(){
        System.out.println("In A show");
    }
   static class Wa{// Inner class which is defined inside of a AB class
        public void display(){
            System.out.println("In B Display inside of ");
        }
    }
}

public class staticinnerclass {
    public static void main(String[] args) {
        AB obj= new AB();
        obj.show();
        /*
         So lets explain the how the above code is working
         Here we are creating a object of class AB to call the non static
         method show(), So what we have learned early
         */
        Wa1.Wa obj1= new Wa1.Wa();
        obj1.display();
        /*
        As the class is static then we don't need to create a object 
         */
        
    }
    
}
