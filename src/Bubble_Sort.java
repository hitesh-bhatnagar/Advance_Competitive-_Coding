public class Bubble_Sort {
    public static void main(String[] args) {
        int nums[] =  {6,8,2,3,5,1};
        int size = nums.length;
        int temp ;

        System.out.println("before sorting");
        for(int num : nums) {
            System.out.println(num+ " ");
        }

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("after sorting");
        for(int num: nums) {
            System.out.println(num+ " ");
        }
    }
}