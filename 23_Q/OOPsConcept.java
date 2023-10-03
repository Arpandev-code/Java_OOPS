/******************************************************************************
write a program to demonstrate the functions of a door(constructors) in our desired language in onlinegdb compiler. 

*******************************************************************************/
 class Door{
    private String DoorName;
    private boolean isOpen;
    public Door(String DoorName,boolean isOpen)
    {
        this.DoorName=DoorName;
        this.isOpen=isOpen;
    }
    public void open()
    {
        if(isOpen==false)
        {
            isOpen=true;
            
        }else
        {
            System.out.println("Oops! Door Already opened");
        }
    }
    public void close()
    {
        if(isOpen==true)
        {
            isOpen=false;
    
        }else{
            System.out.println("Oops! Door already Closed");
        }
    }
    public String toString(){
        return "Door Name: "+DoorName+"| Status: "+(isOpen?"Open":"Close");
    }

}

public class OOPsConcept{
    public static void main(String[] args) {
		Door sc=new Door("Front",false);
		sc.close();
		System.out.println(sc);
	}
}