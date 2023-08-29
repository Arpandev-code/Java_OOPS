//In Java, enum extends the enum class and we get all 
//other methods present inside an enum through the enum class only.

enum Status1{
    Connted,
}



public class enum5 {
    public static void main(String[] args) {
        Status1 s= Status1.Connted;
        // If we print the superclass of an enum class, then it will also return an enum.
        System.out.println(s.getClass().getSuperclass());
    }
}
