class Switch1{
    public static void main(String[] args) {
        int n=1;
        switch(n)
        {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tushday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            default:
            System.out.println("Sunday");
        }
        /*
what dataType we can use in switch statement?
-- the switch statement can have a number of possible execution paths. A switch works with the 
byte, short, char, and int primitive data types. It also works with enumerated types (discussed in Enum Types), 
the String class, and a few special classes that wrap certain primitive types: Character, Byte, Short, and Integer.
         */
    }
}