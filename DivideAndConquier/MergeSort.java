class MergeSort{

    public static void printArr(int a[]){
        for(int i=0; i<=a.length-1; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void sort(int a[], int si, int ei){
        if(si >= ei){
            return;
        }

        int mid = si + (ei-si)/2;//(si+ei)/2
        //left 
        sort(a,si,mid);

        // right
        sort(a,mid+1,ei);

        merge(a,si,mid,ei);
    }

    public static void merge(int a[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j<= ei){
            if(a[i] < a[j]) {
                temp[k++] = a[i++]; 
            }else{
                temp[k++] = a[j++]; 
            }
        }

            
            //remaining left part
            while(i <= mid){
                temp[k++] = a[i++]; 
            }
        
            //remaining right part 
            while(j<= ei){
                temp[k++] = a[j++]; 
            }

            //copying temp arr into original array 
            for(k=0,i=si; k<temp.length; k++,i++){
                a[i] = temp[k];
            }
    }

    public static void main(String[] args) {
        int a[] = {7,7,1,6,7,8,9,3};
        sort(a, 0, a.length-1);
        
        printArr(a);
    }
}