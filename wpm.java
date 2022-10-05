import java.io.ObjectInputFilter.Status;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class wpm{
     static String words[]={"Hello,","wello ,","challo ,","let's,go ,","yours ,","drama,","freshly ,",
    "yellow ,","laptop ,","Aayushi ,","pillow,"
    };
    public static void main(String[] args) throws InterruptedException {
        System.out.println("SO ARE YOU READY?!");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);
System.out.println("2");
TimeUnit.SECONDS.sleep(1);
System.out.println("1");
TimeUnit.SECONDS.sleep(1);
Random rand= new Random();
for(int i=0;i<11;i++){
System.out.print(words[rand.nextInt(10)]+" ");
}
System.out.println();
double start= LocalTime.now().getNano();
Scanner sc= new Scanner(System.in);
String typeword= sc.nextLine();
double end = LocalTime.now().getNano();
double time=end-start;
double sec=time/1000000.0;
int cumchar= typeword.length();
int wpm=(int) ((((double)cumchar/5)/sec)*60);
System.out.println("the word per min is:"+wpm+"wpm"+"!!");
    }
}