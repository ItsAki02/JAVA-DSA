package LinearSearch;


public class LinearSearch {
    public static void main(String[] args) {
        
        //search in array: return the index if item found
        //otherwise if item not found return -1

        int[] nums = {23,45,1,2,8,-3,16,-11,28};
        int target = -3;
        int ans = linearSeach(nums, target);
        System.out.println(ans);


    }

    static int linearSeach(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        //run a for loop
        for(int index = 0; index < arr.length; index++){
            //check for element at every index if it is  target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return Integer.MAX_VALUE;

    }
    
}
