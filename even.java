import java.util.*;
public class even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        System.out.println("The even numbers upto "+ num +" are :");
        for(int i=1;i<=num;i++){
            if(i%2==0){
               System.out.println(i);
               count++;
            }
        }
System.out.println("count is "+count);
    }
}
