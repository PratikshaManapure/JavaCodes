import java.util.*;
public class doWhile {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers you want to enter:");
        int n = sc.nextInt();
        int count = 0;
        for(int i=1;i<=n;i++){
        int num = sc.nextInt();
        count = count+num;
        }
       System.out.println("sum of entered number is : "+ count);

    }
        
    
}
