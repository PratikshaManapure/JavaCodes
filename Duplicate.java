public class Duplicate {
    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,3,2,7,4,8,8,3};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+"is repeated "+count+"times");
        }
    }
}
