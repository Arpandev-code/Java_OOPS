public class copyonearraytoanother {
    public static void main(String[] args) {
        int a[]={1,8,3};
        int b[]=a.clone();

        for(int arr:b)
        {
            System.out.println(arr);
        }

    }
}
