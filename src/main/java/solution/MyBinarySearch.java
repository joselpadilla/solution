package solution;

public class MyBinarySearch {
   public static int search(int[] arr, int left, int right, int x) {

       while(right >= left){
          int m = left + (right-left)/2;
          if(arr[m] == x)
              return m;
          if(arr[m] > x)
              return search(arr, left, m-1, x);
          return search(arr, m+1, right, x);
       }

       return -1;
   }

   public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
       System.out.println(search(arr, 0, arr.length - 1, 7));
   }
}
