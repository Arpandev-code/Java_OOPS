public class exception3 {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0) throw new ArithmeticException("I don't want zero");
        }
        catch(ArithmeticException obj){
            j=18/1;
            System.out.println("Backup Database connected"+    obj);
        }
    }
}
