package solution;

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {

		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++)
				if((nums[i] + nums[j]) == target) {
					return new int[] {i,j};
			}
		}

		return new int[]{0,0};
	}
	
	public static void main(String[] args) {
		
		TwoSum result = new TwoSum();
		
		int[] indexes = result.twoSum(new int[]{4,7,2,3} , 6);

		for (int index : indexes) System.out.print(index + " ");
	}
}
