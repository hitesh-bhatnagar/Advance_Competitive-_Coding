import java.util.Arrays;

public class Binary_Search_Recursion {
    public static void main(String[] args) {
        int[] nums = {5,34,4,11,2};
        int target = 5;


        // Step 1: Sort the array
        Arrays.sort(nums);
        System.out.println("Sorted Array " + Arrays.toString(nums));
        // Step 2: Perform the binary search
        int result= binarySearch(nums, target , 0 , nums.length);

        // step 3: check and print the result
        if(result != -1)
            System.out.println("Element found at index:" + result);
        else
            System.out.println("element not found");
    }
    public static int binarySearch(int[] nums, int target, int left , int right) {

        if (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                return binarySearch(nums, target, mid+1, right);
            }
            else {
                return binarySearch(nums, target,left , mid-1);
            }
        }

        return -1;
    }
}
