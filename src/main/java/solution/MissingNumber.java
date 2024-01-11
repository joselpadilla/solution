package solution;
  
public class MissingNumber {
    // Function to return the missing element
    public static int findMissing(int arr[], int n)
    {
 
        int l = 0, h = n - 1;
        int mid;
 
        while (h > l) {
 
            mid = l + (h - l) / 2;
 
            // Check if middle element is consistent
            if (arr[mid] - mid == arr[0]) {
 
                // No inconsistency till middle elements
                // When missing element is just after
                // the middle element
                if (arr[mid + 1] - arr[mid] > 1)
                    return arr[mid] + 1;
                else {
 
                    // Move right
                    l = mid + 1;
                }
            }
            else {
 
                // Inconsistency found
                // When missing element is just before
                // the middle element
                if (arr[mid] - arr[mid - 1] > 1)
                    return arr[mid] - 1;
                else {
 
                    // Move left
                    h = mid - 1;
                }
            }
        }
 
        // No missing element found
        return -1;
    }
 
    // Driver code
    public static void main(String args[])
    {
        int arr[] = { -9, -8, -7, -5, -4, -3, -2, -1, 0 };
        int n = arr.length;
 
        System.out.print(findMissing(arr, n));
    }
}
