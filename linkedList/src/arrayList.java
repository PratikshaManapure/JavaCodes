import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String []args){
        List<String > list = new ArrayList<>();
        list.add("CSE");
        list.add("CT");
        list.add("IT");
        list.add("AIML");

        for(String i : list){
            System.out.println(i);
        }

//        System.out.println("\n");

        list.add(2, "CSD");

        System.out.println("Updated List: ");
        for(String i : list){
            System.out.println(i);
        }

        list.remove("IT");

        list.remove(1);
        list.remove(0);

        System.out.println("Updated List after removing elements of index 1, 0: ");
//        for(String i : list){
//            System.out.println(i);
//        }

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("Printing elements using get function: " + list.get(0));

        list.set(1, "IOT");

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }

}
