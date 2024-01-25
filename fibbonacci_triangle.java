public class fibbonacci_triangle{
    public static void main(String[] args) {
        int first_term=0;
        int last_term=1;
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
            System.out.print(first_term+" ");
            int next=first_term+last_term;
            first_term=last_term;
            last_term=next;
            }
            System.out.println();
        }
    }
}
