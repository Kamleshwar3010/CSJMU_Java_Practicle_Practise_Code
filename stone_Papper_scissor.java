import java.util.Random;
import java.util.Scanner;
public class stone_Papper_scissor 
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Stone papper scissor");
System.out.println("0 for stone");
System.out.println("1 for papper ");
System.out.println("2 for scissor");
int computer,player;
for (int index = 0; index < 5; index++) {
    Random rand=new Random();
computer=rand.nextInt(3);
player=sc.nextInt(3);
if (computer==0) {
    System.out.print("Computer Choose stone And"); 
} else if (computer==1) {
    System.out.print("Computer Choose Papper And"); 
}else if (computer==2) {
    System.out.print("Computer Choose scicceor And"); 
}
if (player==0) {
    System.out.print(" Player Choose stone :"); 
} else if (player==1) {
    System.out.print(" Player Choose Papper :"); 
}else if (player==2) {
    System.out.print(" Player Choose scicceor :"); 
}
if (computer==0 && player==1||computer==1 && player==2||computer==2 && player==0) {
    System.out.println("Player win"); 
}
else if (computer==player){
    System.out.println("Draw");
}
else{
    System.out.println("Player Loss");
}
}
}
}