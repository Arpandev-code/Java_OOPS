public class SwitchAsExpration {
    public static void main(String[] args) {
        String day="Sunday";
        String result="";
        switch(day)
        {
            case "Sunday","Saturday"-> result="6am";
            case "Monday"-> result="8am";

        }
        System.out.println(result);
    }
}
