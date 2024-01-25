public class shivneet28 {
    public static void main(String[] args) {
        // int n=5;
        for (int i = 1; i <=5; i++) {
            for (int j = 5; j >=i; j--) {
                System.out.print(" ");
            }
            // int v=0;
            for (int k= 1; k <=i; k++) {
                System.out.print(k+" ");
            }
            for (int l = i-1; l >0; l--) {
                // if(i==1){
                //     continue;
                // }
                    System.out.print(l+" ");
                }
            System.out.println();
        }
    }
}
