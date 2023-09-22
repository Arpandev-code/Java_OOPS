public class array{
    public static void main(String[] args) {
       // int arr[][]=new int[3][4];

        int arr[][]=new int[3][];// jagged array
        arr[0]= new int[3];
        arr[1]=new int[4];
        arr[2]=new int[2];

        //  for(int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //         arr[i][j]=(int)(Math.random()*10);
        //     }
        // }


        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=(int)(Math.random()*10);
            }
        }


        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
    
       // for each loop
        for (int n[] : arr) {
            for(int m:n){
                System.out.print(m+ " ");
            }
            System.out.println();
        }
    }
}