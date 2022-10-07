import java.util.Scanner;

public class max_min {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    int min=0;
    int max=0;
    int num[]=new int[6];
    for(int i=0;i<6;i++){
        num[i]=sc.nextInt();
        if(num[i]>max){
           max=num[i];
        }
        if(num[i]<min){
            min=num[i];
        }
    }
    System.out.println("the max number is "+max);
System.out.println("the min number is "+min);
   } 
}
