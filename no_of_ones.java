// program to count the number of 1’s in a binary representation of the number.
public class no_of_ones{
public static void main(String args[]){
    int count=0 ,i=0;
int num = 5,bitmask=1<<i;
while(i<4){
if((num & bitmask) == 1){
count++;
bitmask=1<<i;
}
i++;
}
System.out.println(count);
}
}
