package solution;

public class SingleElement {
	
	public static int findSingle(int[] nums) {
		
		for (int i = 0; i < nums.length; i+=2) {
			if((i+1) < nums.length)
			if(nums[i] == nums[i+1])
				continue;
			return nums[i];
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] nums = {1,1,2,3,3,4,4,5,5};
		
		System.out.print(findSingle(nums));
		
		

	}

}
