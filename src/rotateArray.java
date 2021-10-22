public class rotateArray {
	static void reverse(int nums[],int left,int right){
		while(left<right){
			int swap=nums[left];
			nums[left]=nums[right];
			nums[right]=swap;
			left++;
			right--;
		}
	}
	public static void rotate(int[] nums, int k) {
		if(k>=nums.length)
			k=k%nums.length;
		reverse(nums,0,nums.length-1);
		reverse(nums,0,k-1);
		reverse(nums,k,nums.length-1);
	}
	public static void main(String[] args){
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
		rotate(nums, 3);
		for (int num : nums)
			System.out.println(num);
	}

}
