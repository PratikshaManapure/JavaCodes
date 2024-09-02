interface AddOperation{
    int add(int a, int b);
}

public class LambdaAddition {
    public static void main(String[] args){
        AddOperation addition = (a, b) -> a + b;

        int num1 = 5;
        int num2 = 10;
        int result = addition.add(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is "+result);
    }
}
