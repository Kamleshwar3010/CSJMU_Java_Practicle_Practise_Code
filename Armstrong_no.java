import java.util.Scanner;
import java.lang.Math;

public class Armstrong_no {
    public static void main(String[]args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Programme to Check Armstrong Number");
    System.out.print("Enter the number to check-\t");
    int num,rem,orgnum,result=0;
    num=sc.nextInt();
    sc.nex
    orgnum=num;
    for (int i = 0; orgnum!=0; i++) {
         rem = orgnum % 10;
    result += Math.pow(rem, 3);
    orgnum /= 10;
    }
    if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num+ " is not an Armstrong number.");
}
}
