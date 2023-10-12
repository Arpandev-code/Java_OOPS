class StringQ2{
    public static void main(String args[])
    {
        String s="Arpaandev";
        String s1=s.toLowerCase();
        boolean isReapting=false;
        for(int i=1;i<s1.length();i++)
        {
            if(s1.charAt(i-1)==s1.charAt(i))

            System.out.println(i);
            isReapting=true;
        }
    }
}