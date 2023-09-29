//Can you replace this with smth else?

class Human{
    private int age;
    private int height;
    public void setAge(int age,Human obj)
    {
        Human obj1=obj;
        obj1.age=age;
    }
    public void setHeight(int height,Human obj)
    {
        Human obj1=obj;
        obj1.height=height;

    }
    public int getAge(){
        return age;
    }
    public int getHeight(){
        return height;
    }
}

class NoThis{
    public static void main(String[] args) {
        Human obj=new Human();
        obj.setAge(20, obj);
        obj.setHeight(30, obj);
        System.out.println(obj.getAge());
        System.out.println(obj.getHeight());
    }
}