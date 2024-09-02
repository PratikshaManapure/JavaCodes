public class exceptionHandling {
    public static void main(String[]args){
        int num = 55;
        int data;
        try{
            data = num/0;
            System.out.println("Try Block");
        }catch(ArithmeticException e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
