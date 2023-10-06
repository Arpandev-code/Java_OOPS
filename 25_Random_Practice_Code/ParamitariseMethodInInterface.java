interface Dev
{
    void show(int i);
}



public class ParamitariseMethodInInterface {
    public static void main(String[] args) {
        Dev obj=(int i)-> System.out.println("In new show"+i);
            
        obj.show(5);
    }
}
