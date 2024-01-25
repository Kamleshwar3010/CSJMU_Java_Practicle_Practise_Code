import java.util.Scanner;
public class Sum_of_Three_No
{
public static void main(String[]args)
{
System.out.println("Program for Sum of Three Number");
 Scanner sc = new Scanner(System.in);
 int first,second,third,sum;
 System.out.print("Plese Enter First Number : ");
 first=sc.nextInt();
 System.out.print("Plese Enter Second Number : ");
 second=sc.nextInt();
 System.out.print("Plese Enter Third Number : ");
 third=sc.nextInt();
 sum=first+second+third;
 System.out.print("Sum is = ");
 System.out.print(sum);

}
}
