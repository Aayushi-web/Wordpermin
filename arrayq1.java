import java.util.Scanner;



public class arrayq1 {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int size= sc.nextInt();
    String  name[]= new String [size];
    //input
    for(int i=0;i<size;i++){
        name[i]=sc.nextLine();
    }
    //output
    for(int i=0;i<size;i++){
        System.out.print(name[i]+" ");
    }
    System.out.println();
   } 
}
