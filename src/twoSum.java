public class twoSum{
    public static int[] sol(int[] nums, int target){
        for(int i = 0; i < nums.length;i++){
            for(int j = i + 1; j < nums.length; j++){
                if ((nums[i] + nums[j]) == target) {
                    return(new int[] {i, j});
                }
            }
        }
        return (new int []{});
    }

    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int[] res = sol(nums, 9);
        for(int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }

}