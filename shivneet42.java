import java.util.Scanner;

public class shivneet42 {
    public static void main(String[] args) {
        int num,flag=1;
        System.out.print(("!!!!!! Enter the number "));
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        sc.close();
for(int i=2;i<num;i++){
    if(num%i==0 ){
      flag=0;
       break;
    }
}
if(flag==1){
   System.out.println("PRIME NUMBER");
}
    else{
        System.out.println("not PRIME NUMBER");
    }
    }
}
