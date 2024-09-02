

public class Arrays {
    public static void main(String[] args){
        int[] arr1 ={4,3,2,1,0};
        int size = 5;
        int min = 0;
        int max = 0;
        if(arr1[0]>arr1[1]){
            max=arr1[0];
            min=arr1[1];
        }else{
            max=arr1[0];
            min=arr1[1];
        }
            
        
        for(int i=2;i<size;i++){
            if(arr1[i]>min){
                max=arr1[i];
            }else{ 
                if(arr1[i]<max){
                    min=arr1[i];
                }
            }
            
        }
        System.out.println("minimum :" + min +" maximum is:" + max);
        
    }
}