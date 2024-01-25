import java.util.Scanner;

public class shivneet49 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" !!!!! Enter the Character ");
        String c=sc.nextLine();
        sc.close();
        if(c.equals(c.toLowerCase())){
            System.out.println("\t\t"+c.toUpperCase());
        }
        else{
            System.out.println("\t\t"+c.toLowerCase());
        }
    }
}
