public class Linear_Search {
    public static void main(String[] args) {
        int[] nums = {5,34,4,6,2};
        int target = 6;

        int result= LinearSearch(nums, target);

        if(result != -1)
            System.out.println("Element found at index:"+result);
        else
            System.out.println("element not found");
    }

    public static int LinearSearch(int[] nums, int target) {

        for (int i=0; i< nums.length; i++) {

            if (nums[i] == target)
                return i;
        }


        return -1;
        
    }
}