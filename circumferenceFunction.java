import java.util.*;

public class circumferenceFunction {
    /*public static double getCircumference(double radius){
        return 2*3.14*radius;
    }*/
    public static boolean eligible(int age){
        if(age>18){
          return  true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius:");
       // double radius = sc.nextDouble();
       // System.out.println("circumference is : "+ getCircumference(radius));
       int age = sc.nextInt();
       System.out.println(eligible(age));
    }
}
