
public class even_odd {
    public static void main(String[]args)
    {
    System.out.println("Program to print even and odd no between 1 to 100");
    for (int i = 1; i <=100; i++) {
        if (i%2==0) {
            System.out.println(i + " is even");
        } else {
            System.out.print(i + " is odd\t"); 
        }
    }
    
    }
}
