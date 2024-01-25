public class shivneet25 {
    public static void main(String[] args) {
        for (int i=0;i<=4;i++) {
            for (int k= 0; k <i; k++) {
                  System.out.print(" ");
                 }
                 for (int j =5; j>i; j--) {
                    if(i==4){
                        continue;
                     }
                    System.out.print(j);
                 }
              System.out.println();
          }
    }
}
