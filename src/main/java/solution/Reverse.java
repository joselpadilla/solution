package solution;

public class Reverse {

    public static void rotate(int[] arr, int order) {
        int a = arr.length - order;

        reverse(arr, 0, a-1);
        reverse(arr, a, arr.length-1);
        reverse(arr, 0, arr.length-1);
        for(int i= 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;

        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 2);
    }
}
