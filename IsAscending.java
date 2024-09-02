import java.util.*;
public class IsAscending {
    public static void main(String[] args){
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        boolean isAscending = true;
        int numbers[] = new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        for(int i=0; i<numbers.length-1; i++){
            if(numbers[i] > numbers[i+1]){
                isAscending = false;
            }
        }
        if(isAscending){ 
            System.out.println("The array is sorted in ascending order.");
        }else{
            System.out.println("The array is sorted in descending order.");
        }
    }
}
