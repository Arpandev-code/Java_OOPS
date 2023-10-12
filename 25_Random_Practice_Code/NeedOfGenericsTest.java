import java.util.ArrayList;

public class NeedOfGenericsTest {
    public static void main(String[] args) {
        //Let's first Create A Array which holds String values

        String [] str=new String[10];
        str[0]="Arpan";
        str[1]="Priyam";
      //  str[2]=10; it will show type missmatch Error cuz Java is TypeSafe language
        ArrayList list=new ArrayList();
        list.add(0);
        list.add("A");
        list.add("Ami");

        int String= (int) list.get(0);



    }
}
