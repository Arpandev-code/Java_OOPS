//We can declare the main() method inside the enum. Hence we can invoke the enum directly from the Command Prompt.

enum Color {
    RED,
    GREEN,
    BLUE;
 
    // Driver method
    public static void main(String[] args)
    {
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}
