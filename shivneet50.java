import java.util.Scanner;

public class shivneet50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" !!!!! Enter the Character ");
        String c=sc.next();
        sc.close();
        String First=c.substring(0, 1).toUpperCase();
        String Rem=c.substring(1, c.length()).toLowerCase();
        System.out.println("\t\t"+First+Rem);
    }
}
