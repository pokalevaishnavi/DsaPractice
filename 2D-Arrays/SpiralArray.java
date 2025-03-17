
public class SpiralArray {

    public static void printArr(int a[][]){
        int n = a.length;
        int m = a[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void spiralPattern(int a[][]){
        int strRow = 0;
        int endRow = a.length - 1;
        int strCol = 0;
        int endCol = a[0].length - 1;

        while(strRow <= endRow && strCol <= endCol){
            //top
            for(int j=strCol; j<=endCol; j++){
                System.out.print(a[strRow][j]+" ");
            }

            //right
            for(int i=strRow+1; i<=endRow; i++){
                System.out.print(a[i][endCol]+" ");
            }

            //bottom
            for(int j=endCol-1; j>=strCol; j--){
                System.out.print(a[endRow][j]+" ");
            }

            //left
            for(int i=endRow-1; i>=strRow+1; i--){
                System.out.print(a[i][strCol]+" ");
            }

            strCol++;
            strRow++;
            endCol--;
            endRow--;

        }
    }

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4},
                     {5, 6, 7, 8},
                     {9, 10, 11, 12},
                     {13, 14, 15, 16}};
        printArr(a);
        spiralPattern(a);
    }
    
}
