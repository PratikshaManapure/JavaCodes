public class Calculate {

    int num1;
    int num2;

    void addition(){
        System.out.println("Sum is : " + (num1+num2));
    }

    void subtraction(){
        System.out.println("Difference is : " + (num1-num2));
    }
    
    void multiplication(){
        System.out.println("product is : " + (num1*num2));
    }
    
    public static void main(String[] args){
        Calculate c1 = new Calculate();
        c1.num1 = 30;
        c1.num2 = 20;
        c1.addition();
        c1.subtraction();
        c1.multiplication();
    }
}
