import java.util.*;
public class vector {
    public static void main(String[] args){
        Vector list = new Vector();
        list.addElement(100);
        list.addElement(200); 
        list.addElement(300);
        list.addElement(200);
        list.addElement(400);
        list.addElement(500);
        list.addElement(700);
        System.out.println("1.Display list\n2.Remove first occurance of repeated element\n3.Remove element present at 4th index\n4.Display element present at index 1");
        System.out.println("Enter your choice:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Given list: " + list);
                break;
            case 2:
                list.remove(3);
                System.out.println("Updated list: " + list);
                break;
            case 3:
                list.remove(4);
                System.out.println("Updated list: " + list);
                break;
            case 4:
                System.out.println("Element present at index 1 is :" +list.get(1));        
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

    }
}
