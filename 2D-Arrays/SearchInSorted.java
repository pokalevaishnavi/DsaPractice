public class SearchInSorted {

    public static boolean staircaseSearch(int a[][], int key) {
        int row = 0;
        int col = a[0].length-1;

        while (row < a.length && col >= 0) {
            if (a[row][col] == key) {
                System.out.println("Key found at " + "(" + row + "," + col + ")");
                return true;
            }

            else if (key > a[row][col]) {
                row++;
            }

            else {
                col--;
            }
        }
        System.out.println("Key did not found.");
        return false;
    }
    public static void main(String args[]){
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };
                      
        staircaseSearch(a,13);
    }
}
