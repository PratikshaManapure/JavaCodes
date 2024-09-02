import java.util.*;
import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(9);
        list.add(6);
        list.add(10);
        list.add(8);
        System.out.println("The given list is: " + list);
        System.out.println("Enter your choice to perform specific operations on given list:");
        System.out.println("1.Get element\n2.Add element\n3.Add element of heterogenous type\n4.Set element at specific index\n5.Delete element from specific index\n6.Print size of given list\n7.Iterate on the list\n8.Sort the given list");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int c;
        switch(choice){
            case 1:
            System.out.println("which element do you want: ");
            c = sc.nextInt();
            System.out.println("The element present at index "+ c +" is "+ list.get(c));
            break;
            case 2:
            System.out.println("Enter the element you want to add:");
            c = sc.nextInt();
            list.add(c);
            System.out.println("New list is: "+ list);
            break;
            case 3:
            System.out.println("Enter the element of float type:");
            float c1 = sc.nextFloat();
            list.add(c1);
            System.out.println("New list is: " + list);
            break;
            case 4:
            System.out.println("Enter the index at which you want to add new element: ");
            c = sc.nextInt();
            System.out.println("Enter the element which you want to add: ");
            int c2 = sc.nextInt();
            list.set(c,c2);
            System.out.println("New list is: " + list);
            break;
            case 5:
            System.out.println("Enter the index of element you want to delete: ");
            c = sc.nextInt();
            list.remove(c);
            System.out.println("New list is: "+list);
            break;
            case 6:
            System.out.println("The size of the given list is: "+list.size());
            break;
            case 7:
            //list.iterator();
            System.out.println("After iterating the list: " + list);
            break;
            case 8:
            list.sort(null);
            System.out.println("The sorted list is:" + list);
            break;
            default:
            System.out.println("Invalid choice.");
        }

    }
}
