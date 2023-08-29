/*
Imp:
 Every enum constant is always implicitly public static final. 
 Since it is static, we can access it by using the enum Name. 
 Since it is final, we can’t create child enums.
 */


enum Status{
    Connecting,
    Reconnecting,
    Connected,
    Error,
    Failed,
}
/*
  In switch case, we do not have to pass the object refernce variable again and again. 
  We have to only pass the constant itself.
 */




public class enum2 {
    public static void main(String[] args) {

        Status s=Status.Connected;
        switch(s){
            case Connecting:
            System.out.println("Establising Connection between server & client...");
            break;
            case Reconnecting:
            System.out.println("Retrying connection.....");
            break;
            case Connected:
            System.out.println("Connection Establised Sucessfully!");
            break;
            case Failed:
            System.out.println("Oops! Some went wrong while connecting to server!");
            break;
            default:
            System.out.println("Can't Resolve the Error!");
        }
        
    }
}
