import java.util.Scanner;

public class Zoos {
    public static void main(String[] args) {
        int countz=0,counto=0;
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        char []str=name.toCharArray();
        for(int i=0;i<str.length;i++){
            if(str[i]=='z'){
                countz++;
            }
            else{
                 counto++;
            }
        }

        if(counto==2*countz){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
