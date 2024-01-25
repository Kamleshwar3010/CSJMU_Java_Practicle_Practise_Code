class Prime_no{
    static int prime(int num){
        int flag=1;
        for(int i=2; i<num;i++){
            if(num%i==0){
             flag=0;
             break;
            }
        }
        if(flag==1){
            System.out.println(num);
        }
        return 0;
     }
    public static void main(String[]args)
    {
    System.out.println("Programme to print prime number between 1 to 1000");
     for (int i = 1; i <=1000; i++) {
        prime(i);
     }
    }
}