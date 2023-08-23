import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiffDiagonal {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int n = arr.size();
        int lSum = 0;
        int rSum = 0;
        int res = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < arr.size(); j++){
                if( i == j){
                    lSum += arr.get(i).get(j);
                }
                if(i + j == n-1 ){
                    System.out.println(arr.get(i).get(j));
                    rSum += arr.get(i).get(j);
                }
            }
        }

        res = Math.abs(lSum - rSum);
        return res;
    }

    public static void main(String[] args) {
        // Create the matrix as a List<List<Integer>> object
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(11, 2, 4));
        matrix.add(Arrays.asList(4, 5, 6));
        matrix.add(Arrays.asList(10, 8, -12));

        // Calculate the diagonal difference using the DiagonalDifferenceCalculator

        System.out.println(matrix);
        int difference = diagonalDifference(matrix);

        // Print the result
        System.out.println("Diagonal Difference: " + difference);
    }
}
