import java.util.*;
public class co {
    public static void main(String args[]){
    // for(int i=0;i<=5;i++){
    //     if(i==3){
    //         continue;
    //     }
    //       System.out.println(i);
    // }

    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the number");
    do{
        int a=sc.nextInt();
        if(a%10==0){
            continue;
        }
        System.out.println(a);
    } while(true);
    }
}
