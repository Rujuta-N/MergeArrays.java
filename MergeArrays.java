import java.util.Arrays;

public class MergeArrays {

    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        // Move non-zero elements of X to the end
        int k = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k] = X[i];
                k--;
            }
        }
        
        // Merge Y[] into X[]
        int i = k + 1; // Start of X
        int j = 0; // Start of Y
        int p = 0; // Start of merged array
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[p++] = X[i++];
            } else {
                X[p++] = Y[j++];
            }
        }
        
        // Copy remaining elements of Y[] if any
        while (j < n) {
            X[p++] = Y[j++];
        }
    }

    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };
        
        // Merge arrays
        mergeArrays(X, Y);
        
        // Output merged array X
        System.out.println("Merged array: " + Arrays.toString(X));
    }
}
