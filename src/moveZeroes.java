public class moveZeroes {
    public static void move(int[] nums){
        int i = 0;
        int c = 0;
        int len = nums.length;
        int tmp;
        while (i < len){
            if (nums[i] != 0){
                nums[c] = nums[i];
                c++;
            }
            i++;
        }
        while (c < len){
            nums[c] = 0;
            c++;
        }
    }

    public static void main(String[] args){
        int[] nums = {0};
        move(nums);
        for (int num : nums){
            System.out.println(num);
        }
    }

}
