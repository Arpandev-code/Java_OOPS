public class SwitchAsExpration2 {
    public static void main(String[] args) {
        String day="Sunday";
        String result="";
      result=  switch(day)
        {
            case "Sunday","Saturday": yield "6am";
            case "Monday": yield "8am";
            default: yield "10am";
        };
        System.out.println(result);
    }
}
