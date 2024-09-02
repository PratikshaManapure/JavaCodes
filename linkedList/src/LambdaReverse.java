interface reverseArray{
    void reverse(int arr[], int size);
}

public class LambdaReverse {
    public static void main(String[] args){
        reverseArray re = (arr, n) ->{
            for(int i = n; i >= 0; i--){
                System.out.println(arr[i] + " ");
            }
        };
        int n = 4;
        int arr[] = {1, 2, 3, 4, 5};

        re.reverse(arr, n);
    }
}
