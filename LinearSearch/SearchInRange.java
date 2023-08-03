package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,-3,16,-11,28};
        int target = -3;
        System.out.println(searchInrange(nums, target, 1, 5));

    }

    static int searchInrange(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        //run a for loop
        for(int index = start; index <= end; index++){
            //check for element at every index if it is  target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return Integer.MAX_VALUE;

    }
    
}
