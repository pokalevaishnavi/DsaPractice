import java.util.*;
public class TwoDArrays {

    public static boolean findElement(int a[][], int key){
        int n = a.length;
        int m = a[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(a[i][j]==key){
                System.out.println("Key found at " + i +" and "+ j);
                return true;
                }
            }            
        }
        return false;
    }
    public static void main(String args[]){
        int a[][] = new int[3][3];
        int n=3;
        int m=3;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        findElement(a,3);

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
