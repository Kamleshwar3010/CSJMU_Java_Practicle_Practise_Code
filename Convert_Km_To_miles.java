import java.util.Scanner;
public class Convert_Km_To_miles
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Program TO Convert Km Into miles");
float Km,miles;
System.out.print("Enter KiloMeter: ");
Km=sc.nextFloat();
miles=0.621371f;
miles=Km*miles;
System.out.print("There are "+ miles +" Miles in "+ Km +" Km");
}
}
