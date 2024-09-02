import java.util.*;
public class primeFunction {
public static void isPrime(int num){  
    int flag=0;
    if(num==0 || num==1){
        flag=1;
    }
    for(int i=2 ; i<=num/2 ; i++){
        if(num%i==0){
            flag=1;
            break;
        }
    }
    if(flag == 0){
        System.out.println(num + "is prime.");
    }else{ 
        System.out.println(num + "is not prime");
    }
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        isPrime(num);
    }
}
