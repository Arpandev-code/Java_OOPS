public class StringQ3 {
    public static void main(String[] args) {
        String s1="";
        String s2=new String("");
        String s3=s1;
        if(s1==s2){
            System.out.println("S1=S2");
        }
        if(s2==s3)
        {
            System.out.println("S2=S3");
        }
        if(s1==s3)
        {
            System.out.println("S1=S3");
        }
    }
}
//Output=> s1=s3 cuz with the new keyword we are craeting String class object which is 
//stored in heap memory NOT IN String constant pool where as all the other string letarals stored in String pool inside of heap memory
