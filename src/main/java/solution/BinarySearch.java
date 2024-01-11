package solution;

public class BinarySearch {

	public int search(int[] arr, int l, int r, int x) {
		
		while(r >= l) {
			int m = l + (r - l) / 2;
			if(arr[m] == x)
				return m;
			
			if(arr[m] > x)
				return search(arr, l, m - 1, x);
			return search(arr, m + 1, r, x);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		BinarySearch o = new BinarySearch();
		int arr[] = {10,40,55,100,110};
		
		int s = o.search(arr, 0, arr.length - 1, 55);
		System.out.print("The number for search is in " + s);
	}
}
