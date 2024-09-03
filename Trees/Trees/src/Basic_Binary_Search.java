import java.util.*;

class Binary_Search{
    public static int binarySearch(int[] nums, int target){
        int left = 0, right = nums.length -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid +1;
            } else{
                right = mid - 1;
            }
        }
        return -1;
    }

}

public class Basic_Binary_Search{
    public static void main(String[] args) {

        Binary_Search binary = new Binary_Search();
        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println(binary.binarySearch(arr,5));
    }
}