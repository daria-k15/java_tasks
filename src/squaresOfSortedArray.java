import java.lang.reflect.Array;
import java.util.Arrays;

public class squaresOfSortedArray {
	public static int[] sortedSquares(int[] nums){
		int i = 0;
		while (i < nums.length){
			nums[i] = nums[i] * nums[i];
			i++;
		}
		Arrays.sort(nums);
		return (nums);
	}

	public static void main(String[] args){
		int[] nums = {-4, -1, 0, 3, 10};
		int[] res = sortedSquares(nums);
		for (int num : nums)
			System.out.println(num);
	}

}
