import java.util.*;
public class addFunction {
    public static int calculateSum(int a ,int b){
        //int sum = a+b; or
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        //int sum = calculateSum(a,b); or
        System.out.println("sum of "+ a +" and "+ b + " is:"+ calculateSum(a,b));

    }
}
