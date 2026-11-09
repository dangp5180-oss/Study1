public class Duplicates {
    public static void Duplicates(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println(nums[j]);
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 4, 4, 5};
        Duplicates(nums);

    }
}