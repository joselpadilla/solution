package solution;

public class Rotate {

    public void rotate(int[][] matrix) {
    	transpose(matrix);
    	reflect(matrix);
    }
    
    public static void transpose(int[][]matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
    }

    public static void printArray(int[][] m) {
    	for(int i=0; i < m.length; i++) {
    		for(int j=0; j < m[i].length; j++)
    			System.out.print(m[i][j] + " ");
    		System.out.println();
    	}
    }
    
    public static void reflect(int[][]matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = tmp;
            }
        }
    	
    }
    
    public static void main(String args []) {
    
    	int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
    	
    	printArray(m);

    	System.out.println();
    	
    	transpose(m);
    	
    	printArray(m);

    	System.out.println();
    	
    	reflect(m);
    	
    	printArray(m);
    	
    }
}
