public class shivneet36 {
    public static void main(String[] args) {
        int k=0,i,j,temp=0;
        for ( i = 1; i < 6; i++) {
            System.out.print("\t\t");
            for (int l = 5; l >i; l--) {
                System.out.print(" ");
            }
            for ( j = 1; j <=i; j++) {
                k=temp+j;
                System.out.print(k+" ");
            }
            temp=k;
            System.out.println("");
        }
    }
}
