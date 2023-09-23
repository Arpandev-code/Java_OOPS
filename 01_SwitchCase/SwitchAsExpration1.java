public class SwitchAsExpration1 {
    public static void main(String[] args) {
        String day="Sunday";
        String result="";
       result= switch(day)
        {
            case "Sunday","Saturday"-> "6am";
            case "Monday"-> "8am";
            default->"10am";
        };
        System.out.println(result);
    }
}
