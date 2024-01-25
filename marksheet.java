import java.util.Scanner;

class marksheet{
    public static void main(String[]args)
    {
    Scanner sc = new Scanner(System.in);
    int stu,subj;
    int [][] marks= new int [4][6];
     for (stu=0; stu<2; stu++) {
        for(subj=0;subj<5;subj++){
            marks[stu][subj]=sc.nextInt();
        }
     }
    
    for (stu=0; stu<2; stu++) {
        for(subj=0;subj<5;subj++){
            System.out.println(marks[stu][subj]);
        }
        System.out.println();
    }
}
}