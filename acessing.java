import java.util.Scanner;

public class acessing {
  public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
   int size=sc.nextInt();
   int arr[]=new int [size];
   //input
   for(int i=0;i<size;i++){
arr[i]= sc.nextInt();
   }
   boolean isDecending=true;
   //output
   for(int i=0;i<size-1;i++){
  if(arr[i]>arr[i+1]){
    isDecending=false;
  }

   }

   if (isDecending){
    System.out.println("the number is sorted !!");
   } 
   else{
    System.out.println("the number is not sorted");
   }
  }  
}
