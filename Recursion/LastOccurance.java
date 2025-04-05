class LastOccurance{
    //from start
    public static int findLast(int i,int key, int a[]){
        if(i == a.length){
            return -1;
        }

        int isFound = findLast(i+1, key, a);
        if(isFound == -1 && a[i] == key){       
            return i;
        }
        
        return isFound;
    }

    // brute force and from end of the array
    public static int find(int i,int key, int a[]){
        if((i == 0) && (a[i] != key)){
            return -1;
        }

        if(a[i] == key){       
            return i;
        }
        
        return find(i-1, key,a);
    }

    public static void main(String args[]){
        int a[] = {1,4,3,4,5,6};
        int key = 4;
        // int l = a.length-1;
        int l = 0;
        int ans = findLast(l, key, a);
        if(ans == -1){
            System.out.println("Not found");
        }else{
            System.out.println( "Key found at "+ans);
        }
    }
}