class Cal{
    public int add(int n1, int n2){
        return n1+n2;
    }
   
}
class AdvCal extends Cal{
    public int add(int n1, int n2){ // This concept is called method Overridding, everything will be same except method defination
        
       return n1+n2+1;
    }
}
// class C extends B,A{ 
//cuz if 
/*
Multiple inheritance isn't supported  in Java
 cuz if there is same method name in two parent classes(A,B) there will be a conflit in child
 class when you call method by creating obj of child class (C)
 */

    

// }


public class inheritance {
    public static void main(String[] args) {
        AdvCal obj= new AdvCal();
        System.out.println(obj.add(10, 12));
    }
    
}
