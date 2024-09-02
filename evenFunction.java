import java.util.*;
public class evenFunction {
    /*public static void isEven(int n){
        if(n%2==0){
            System.out.println(n +" is even.");
        }else { 
        System.out.println(n +" is odd.");
        }
    }*/
    /*public static void printTable(int num){
        for(int i=1 ; i<=10 ; i++){
            System.out.println(num*i);
        }
    }*/
    /*public static void printAverage(int a,int b,int c){
        System.out.println("Average of "+ a + " , "+ b +" , "+ c +" is: "+ (a+b+c)/3);
    }*/
    /*public static void printSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
             sum=sum+i;
            }
        }
            System.out.println("sum of odd numbers between 1 and "+ n +" is : "+ sum);

    
}*/
    public static int greater(int a,int b){
        if(a>b){
            return a;
        }else{ 
            return b;
        }
    }
    public static void main(String[] args){
        System.out.println("Enter three numbers:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();  
       // int num3 = sc.nextInt();
        //isEven(num);
        //printTable(num);
        //printAverage(num1,num2,num3);       
        //int num = sc.nextInt(); 
        //printSum(num);
       int big= greater(num1,num2);
        //System.out.println("greatest between "+ num1 +" and "+ num2 +" is: "+ big);
    }
}
