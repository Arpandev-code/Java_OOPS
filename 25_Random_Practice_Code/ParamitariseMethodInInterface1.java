interface Test
{
    int show(int a,int b);
}



public class ParamitariseMethodInInterface1 {
    public static void main(String[] args) {
        Test obj= (a,b)-> a+b;
        System.out.println(obj.show(2, 3));
        
    }
}
