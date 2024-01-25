import java.util.Scanner;
public class GPA_Of_Students_Marks
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Program for GPA  of Students Marks");
Float first,second,third,fourth,fifth,total,percentace; 

System.out.print("Plese Enter First Subject  Marks: ");
first=sc.nextFloat(); 
System.out.print("Plese Enter Second Subject Marks : ");
second=sc.nextFloat(); 
System.out.print("Plese Enter Third Subject  Marks: ");
third=sc.nextFloat();
System.out.print("Plese Enter Fourth Subject Marks : ");
fourth=sc.nextFloat(); 
System.out.print("Plese Enter Fifth Subject  Marks: ");
fifth=sc.nextFloat();
total=first+second+third+fourth+fifth;
percentace=(total*100)/500;
System.out.print("Total of All Subject  is : ");
System.out.println(total);
System.out.print("Percentage  : ");
System.out.print(percentace);
}
}
