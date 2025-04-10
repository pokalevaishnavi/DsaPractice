
class QuickSort {

    public static void printArr(int a[]) {
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int a[], int si, int ei){
        if(si>=ei){
            return;
        }

        int pivot = partition(a, si, ei);
        
        //left
        sort(a,si,pivot-1);

        //right 
        sort(a,pivot+1,ei);
    }

    public static int partition(int a[], int si, int ei) {
        int pivot = a[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[ei];
        a[ei] = temp;

        return i+1;

    }

    public static void main(String[] args) {
        int a[] = {7, 7, 1, 6, 7, 8, 9, 3};
        sort(a, 0, a.length - 1);

        printArr(a);
    }
}
