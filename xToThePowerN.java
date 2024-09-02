import java.util.*;
public class xToThePowerN {
    public static int getPower(int x,int n){
        float tim = 8987.4F;
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*x;
        }
        return result;
    }
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter x: ");
     int x = sc.nextInt();
     System.out.println("enter n: ");
     int n = sc.nextInt();
     System.out.println(x +" to the power "+ n +" is "+ getPower(x,n));

    }
}
