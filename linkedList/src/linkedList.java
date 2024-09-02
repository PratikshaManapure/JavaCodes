import java.util.LinkedList;
import java.util.List;

public class linkedList {
    public static void main(String []args){
        List<String> list = new LinkedList<>();
        list.add("abc");
        list.add("xyz");
        list.add("pqr");
        list.add("wer");

        for(String i : list){
            System.out.println(i);
        }

//        System.out.println("\n");

        list.add(2, "uhy");

        System.out.println("Updated List: ");
        for(String i : list){
            System.out.println(i);
        }

        list.remove("ijf");

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

        list.set(1, "kjkaj");

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }

}
