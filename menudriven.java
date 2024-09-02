import java.util.*;
public class menudriven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 or 0:");
        int n = sc.nextInt();
        switch(n){
            case 1 : if(n==1){
                System.out.println("enter yourmarks");
                int marks = sc.nextInt();
                if(marks>=90){
                    System.out.println("this is good");
                }else if(marks<=89 || marks>=60){
                    System.out.println("this is also good");
                }else if(marks<=59 ||marks>=0){
                    System.out.println("this is good as well");
                }
            }
            break;
            case 2:if(n==0){
                break;
            }
        }
    }
}
