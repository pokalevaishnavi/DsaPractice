class FirstOccurance{

    
    public static int find(int i,int key, int a[]){
        if(i == a.length){
            return -1;
        }

        if(a[i] == key){       
            return i;
        }
        
        return find(i+1, key,a);
    }

    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6};
        int key = 4;
        if(find(0, key, a) == -1){
            System.out.println("Not found");
        }else{
            System.out.println( "Key found at "+find(0,key,a));
        }
    }
}