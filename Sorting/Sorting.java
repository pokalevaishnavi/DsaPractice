package Sorting;



public class Sorting {

    public static void printArr(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
    }

    public static void selectionSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[minPos] > a[j]) {
                    minPos = j;
                }
            }
            int t = a[i];
            a[i] = a[minPos];
            a[minPos] = t;
        }
    }

    public static void insertionSort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int curr = a[i];
            int prev = i - 1;
            while (prev >= 0 && curr < a[prev]) {
                a[prev +1] = a[prev];
                prev--;
            }
            a[prev + 1] = curr;
        }
    }

    public static void countingSort(int a[]){
        int range=Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            range = Math.max(range,a[i]);
        }

        int count[] = new int[range+1];

        for(int i=0; i<a.length; i++){
            count[a[i]]++;
        }
        
        int j=0;
        for(int i=0; i<=range; i++){
            while(count[i]>0){
            a[j] = i;
            count[i]--;
            j++;
            }
        }

    }

    public static void main(String[] args) {
        int a[] = {2, 9, 5, 6, 1, 2};
        printArr(a);
        // Arrays.sort(a,0,5);
        // Arrays.sort(a,Collections.reverseOrder());
        countingSort(a);
        printArr(a);

    }
}
