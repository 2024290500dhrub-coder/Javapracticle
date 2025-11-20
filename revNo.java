public class revNo {                             // In this code we only print the reverse number not the actual change in number... 
    public static void main(String args[]){
          int n=29122005;
    while(n>0){
       int lastDigit=n%10;
      System.out.print(lastDigit);
      n= n/10;               
    }
      System.out.println();
    }
}
