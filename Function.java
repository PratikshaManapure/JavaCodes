import java.util.*;
public class Function {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        // function:
        // returnType functionName(type arg1 , type arg2,...){
       //     operation
       // }
       Scanner sc = new Scanner(System.in);
       String name = sc.nextLine();
       printMyName(name);

        }
    }

