public class searchInsertPosition {
    public static int searchInsert(int[] nums, int target){
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;
        while (start <= end){
            mid = start + (end - start)/2;
            if (nums[mid] == mid)
                return mid;
            if (nums[mid] > target){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
//        System.out.println(end);
        return ((mid > end) ? mid : start);
    }

    public static void main(String[] args){
        int[] nums = {1, 3, 5, 6};
        int res = searchInsert(nums, 0);
        System.out.println(res);
    }

}
