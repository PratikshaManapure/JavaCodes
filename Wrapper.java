public class Wrapper {
    public static void main(String[] arg){
        int i = 5;

        //Boxing
        Integer i1 = new Integer(i);
        System.out.println(i1);

        //Autoboxing
        Integer i2 = i;
        System.out.println(i2);

    }
}
