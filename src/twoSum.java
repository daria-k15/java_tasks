public class twoSum {
    public static int[] sum(int[] nums, int target){
        int[] res = new int[2];
        int i = 0;
        int j = nums.length - 1;
        while (i < j){
            if (nums[i] + nums[j] > target){
                j--;
            }
            else if (nums[i] + nums[j] < target)
                i++;
            else{
                res[0] = i + 1;
                res[1] = j + 1;
                return (res);
            }
        }
        return (res);
    }

    public static void main(String[] args){
        int[] nums = {5, 25, 75};
        int[] res = sum(nums, 100);
        for (int num : res){
            System.out.println(num);
        }
    }
}
