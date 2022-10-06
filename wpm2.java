import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class wpm2 {
    static String words[]={"aayushi ","mishra ","is ","a ","girl ","and  ","she ","love ","to ","code! "};
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Okay so readyy?");
        System.out.println("3");
      TimeUnit.SECONDS.sleep(1);
      System.out.println("2");
      TimeUnit.SECONDS.sleep(1);
      System.out.println("1");
      TimeUnit.SECONDS.sleep(1);
Random rand=new Random();
for(int i=0;i<10;i++){
    System.out.print(words[rand.nextInt(9)]);
}
System.out.println();
double start= LocalTime.now().toNanoOfDay();
Scanner sc= new Scanner(System.in);
String type= sc.nextLine();
double end= LocalTime.now().toNanoOfDay();
double elipsetime= end-start;
double sec=(elipsetime/1000000000.00);
int count=words.length;
int wpm=(int) (((double)(count/5)/sec)*60);
System.out.println("your typing speed is: "+wpm+" wpm!");

    }
}
