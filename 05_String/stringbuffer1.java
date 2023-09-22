public class stringbuffer1 {
    public static void main(String[] args) {
        StringBuffer sc = new StringBuffer("Navin");
        sc.append(" reddy");
       int s1= sc.capacity();
       int s2=sc.length();
       
        System.out.println("StringBuffer Capacity: "+s1+" | String Length: "+s2+ "| String: "+sc);
        
    }
}
