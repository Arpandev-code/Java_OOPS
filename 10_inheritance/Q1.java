class Person{
    private String name;
    public String getName(){
        return name;
    }
}
class Student extends Person
{
    private int id;
    public int getId()
    {
        return id;
    }
}
class Faculty extends Person
{
    private String id;
    public String getId(){
        return id;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Student s=new Student();
        Person p=new Person();
        Person q=new Person();
        Faculty f=new Faculty();
        Object o=new Faculty();
        
        // String n=s.getName();
        // p=s;
        // int id=p.getId();
        // f=q;
        // o=q;
    }
}
