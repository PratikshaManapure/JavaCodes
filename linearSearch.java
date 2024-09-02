import java.util.*;
public class linearSearch {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int size = sc.nextInt();
    int[] numbers  = new int[size];
    String names[] = new String[size];
     System.out.println("Enter the elements of array:");
    for(int i = 0 ; i<size ;i++){
    numbers[i] = sc.nextInt();
   }
    System.out.println("Enter the element you want to entered:");
    int num = sc.nextInt();
    for(int i=0;i<numbers.length;i++){
        if(numbers[i] == num){
            System.out.println("The element " + num + " is found at index : " + i);
        }
    }   
    System.out.println("Enter the names in string array");
    for(int i=0;i<size ;i++){
        names[i] = sc.next();
    }
        System.out.println("thenames are");
        for(int i=0;i<size;i++){
            System.out.println("name " + (i+1) +" is:" +names[i]);
        }

    
}
}
