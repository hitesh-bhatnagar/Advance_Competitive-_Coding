import java.util.Arrays;

public class Binary_Search {
    public static void main(String[] args) {
        int[] nums = {5,34,4,11,2};
        int target = 34;
//        int[] nums = new int[1000];
//        int target = 500;

        // Step 1: Sort the array
        Arrays.sort(nums);
        System.out.println("Sorted Array " + Arrays.toString(nums));
        // Step 2: Perform the binary search
        int result= binarySearch(nums, target);

        // step 3: check and print the result
        if(result != -1)
            System.out.println("Element found at index:" + result);
        else
            System.out.println("element not found");
    }
    public static int binarySearch(int[] nums, int target) {

        int left =0 ;// static point
        int right = nums.length-1;

        while(left <= right) {

            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;         // found the target
            }
            else if (nums[mid] < target) {
                left = mid + 1;     // Search in the right half
            }
            else {
                right = mid - 1;    //  // search in the left half

            }

        }
        return -1;      // element not found
    }
}
