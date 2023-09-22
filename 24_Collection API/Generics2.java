class Container<T extends Number> //as we are extending Number abstract class
{
  private  T value;
    void setValues(T value)
    {
        this.value=value;
    }
    T getValues()
    {
        return value;
    }
    void show(){
        System.out.println(value.getClass().getName());
    }
}

public class Generics2 {
    public static void main(String[] args) {
        Container<Integer> obj=new Container<Integer>();
        /*
         While creating a OBJECT of container class , for the type we can only use 
         the Wrapper class which extends the Number abstract class. So we just proved 
         that using Generics we can make the java code more Type Safe.
         */
        obj.setValues(2);
        obj.show();
    }
}
