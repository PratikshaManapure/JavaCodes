interface factorial{
    void fact(int num);
}

public class FactorialUsingLambda {
    public static void main(String[]args){
        factorial fact1 = (num) ->{
            int result = 1;
            for(int i = 1; i <= num; i++){
                result*=i;
            }
            System.out.println("Factorial is " + result);
        };

        int num= 5;
        fact1.fact(num);
    }

}
