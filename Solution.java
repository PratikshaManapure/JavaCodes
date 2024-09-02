import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int j = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();
        String l = scan.nextLine();
    
        System.out.println(i + j);
        System.out.println(d + b);
        System.out.println(s.concat(l)); 

        scan.close();
    }
}