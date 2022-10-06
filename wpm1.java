public class wpm1 {
    
    
  public static void main(String[] args) {
    String words="Aayushi is a girl";
    String word= "";
    String reverse[] =words.split(" ");
for(int i=reverse.length-1;i>=0;i--){
    if(i==0){
        word+=reverse[i];
    }
    else{
        word=word+reverse[i]+" ";
    }
}
System.out.print(word+" ");
  }  
}
