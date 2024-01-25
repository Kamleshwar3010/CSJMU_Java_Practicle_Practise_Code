public class shivneet30 {
    public static void main(String[] args) {
        for (int i =0; i <20; i++) {
            for (int j =19; j >i; j--) {
                 System.out.print(" ");
            }
            for (int k = 0; k <(i*2+1); k++) {
                System.out.print("+");
            }
            System.out.println();
        }
        for (int i =18; i>=0; i--) {
            for (int j =i; j <19; j++) {
                 System.out.print(" ");
            }
            for (int k = (i*2+1); k >0; k--) {
                System.out.print("+");
            }
            System.out.println();
        }
    }    
}
