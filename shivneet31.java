public class shivneet31 {
    public static void main(String[] args) {
        for (int i = 10; i >0; i--) {
            for (int j=i*2; j>=0; j--) {
            int n=10-i;
            if(j==i){
                    for (int k =0; k<(2*n-1); k++) {
                System.out.print(" ");
                if(i==1){
                   if(k==3) {
                    for (int l = 0; l<1; l++){
                     System.out.print("SHIVNEET");
                    }
                   k=11;
                   continue;
                   }
                }
                }
            }
            else{
                System.out.print("+");
            }
        }
        System.out.println();
        }


        for (int i = 1; i<11; i++) {
            for (int j=i*2; j>=0; j--) {
            int n=10-i;
            if(j==i){
                    for (int k =0; k<(2*n-1); k++) {
                System.out.print(" ");
                }
            }
            else{
                System.out.print("+");
            }
        }
        System.out.println();
        }
    }
}
