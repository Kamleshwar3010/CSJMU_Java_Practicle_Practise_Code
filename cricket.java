import java.util.Random;
import java.util.Scanner;
public class cricket {
    public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Cricket");

int computer,score,total=0;
Random rand=new Random();
for (int index = 0; index < 60; index++) {
computer=rand.nextInt(7);
score=sc.nextInt(7);
total=score+total;
System.out.println(score);
int flag=0;
 if (computer==score)
{
 flag=flag+1;
}
   else{
    System.out.println("Score-"+total+"-"+flag);
}
if(flag==3){
    System.out.println("Score-"+total+"-"+flag);
    break;
}
}
}
}
