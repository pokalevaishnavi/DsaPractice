

public class DiagonalSum {

    public static void diagonalSum(int a[][]) {
        int n = a.length;
        int m = a[0].length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            //primary diagonal
            sum += a[i][i];              // i==j

            //secondary diagonal
            if (i != n - 1 - i) {
                sum += a[i][n - 1 - i]; //i+j = n-1
            }
        }
        System.out.println(sum);

    }
    public static void main(String args[]){
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };
                      
                diagonalSum(a);
    }
}
