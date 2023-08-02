package Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(max(arr));
        int[] array = {3, 56, 78,2,5};
        System.out.println(maxRange(array,1,3));
    }
    static int max(int[] arr){
        int maxval = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
         return maxval;
    }
         static int maxRange(int[] array,int start, int end){

            if(end > start){
                return -1;
            }
            if(array == null){
                return -1;
            }
        int maxVal = array[start];
        for(int i = start; i < end; i++){
            if(array[i] > maxVal){
                maxVal = array[i];
            }

    }
        return maxVal;
    
}
}
