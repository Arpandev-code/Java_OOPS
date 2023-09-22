class Container<T>{ //Mentioning the type of the class container as T 
    T value;
    void setValues(T value)
    {
        this.value=value;
    }
    T getValues()
    {
        return value;
    }
   
    void show()
    {
        System.out.println(value.getClass().getName());
    }

}

/*
 In a nutshell, generics enable types (classes and interfaces) to be parameters when defining classes, interfaces and methods.
Much like the more familiar formal parameters used in method declarations, type parameters provide a way for you to re-use the same code with different inputs.
The difference is that the inputs to formal parameters are values, while the inputs to type parameters are types.
 
Code that uses generics has many benefits over non-generic code:
-> Stronger type checks at compile time:
A Java compiler applies strong type checking to generic code and issues errors if the code violates type safety. 
Fixing compile-time errors is easier than fixing runtime errors, which can be difficult to find.
-> Elimination of casts.
- Enabling programmers to implement generic algorithms.
By using generics, programmers can implement generic algorithms that work on collections of different types, can be customized, and are type safe and easier to read.

*/


class Generics{
    public static void main(String[] args) {
        Container<Integer> obj=new Container<Integer>();
        obj.setValues(9);
        obj.show();
    }
}