class SortedOrNot{

    // simple
    public static boolean isSorted(int i, int a[]){
        if(i == a.length-1){
            return true;
        }

        if(a[i] > a[i+1]){       
            return false;
        }
        
        return isSorted(i+1, a);
    }


    //brute force
    public static void check(int i, int a[]){
        
        if((a[i] < a[i+1]) && (i+1 <= a.length-2)){       
            check(i+1,a);
        }else if(i+1 > a.length-2){
            System.out.println("Sorted");
        }else {
            System.out.println("Not sorted");
        }
    }
    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6};
        int i = 0;
        //check(i,a);
        System.out.println( isSorted(0,a));
    }
}