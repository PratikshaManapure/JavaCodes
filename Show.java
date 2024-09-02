import java.util.Scanner;
public class Show {
    public int add(int x, int y){
        return x+y;
    }
    public String add(String x, String y){
        return x+y;
    }
    public double add(double x, double y){
        return x+y;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();;
        int b = scanner.nextInt();
        String s3 = scanner.next();
        String s2 = scanner.next();
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        Show s1 = new Show();
        System.out.println(s1.add(a,b)); 
        System.out.println(s1.add(s3,s2)); 
        System.out.println(s1.add(d1,d2));
    }
}
