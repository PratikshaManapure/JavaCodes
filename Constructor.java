public class Constructor {
    int a ;
    int b ;
    Constructor(int x , int y){
        a = x ;
        b = y ;
    }
    public void printSum(){
        System.out.println("Sum of " + a +" and " + b +" is " + (a+b));
    }

    public static void main(String[] args){
        Constructor c1 = new Constructor(12,14);
        c1.printSum();
    }
}
