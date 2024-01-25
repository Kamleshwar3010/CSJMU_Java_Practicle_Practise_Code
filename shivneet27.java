public class shivneet27 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(j);
            }

            for (int k = 0; k < (i * 2 - 1); k++) {
                System.out.print(" ");

            }

            if (i == 0) {
                for (int l = 4; l > 0; l--) {
                    System.out.print(l);
                }
            } else {
                for (int l = 5 - i; l > 0; l--) {
                    System.out.print(l);
                }
            }
            System.out.println();
        }
    }
}
