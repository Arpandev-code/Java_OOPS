class AB{
    public void show(){
        System.out.println("In A show");
    }
   public class BA{// Inner class which is defined inside of a AB class
        public void display(){
            System.out.println("In B Display inside of ");
        }
    }
}

public class innerclass {
    public static void main(String[] args) {
        AB obj= new AB();
        obj.show();
        /*
         So lets explain the how the above code is working
         Here we are creating a object of class AB to call the non static
         method show(), So what we have learned early
         */
        AB.BA obj1= obj.new BA();
        obj1.display();
        /*
         Same logic goes to the above Code
         So we have to crate a obj of AB then by the obj we have to create obj by the above 
         method
         */

    }
    
}
