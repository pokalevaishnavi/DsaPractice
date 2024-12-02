


public class Arrays {

    public static void printArray(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    

    public static void largestInArray(int num[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0;i< num.length; i++) {
            if(num[i]>largest){
                largest=num[i];
            }            
        }
        System.out.println("Largest element of array is "+largest);
    }

    public static int linearSearch(int num[],int key){
        for(int i =0; i<num.length;i++){
            if(num[i]==key){
                
                return i;
            }           
            
        }
        return -1;
    }

    public static int binarySearch(int num[],int key){
        int start=0;
        int end=num.length-1;
        int mid = 0;
        while(start<=end){
           mid = (start+end)/2;
           if(num[mid]==key){
            return mid;
           }
           else{
            if(key<num[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
           }

        }
        return -1;
    }

    public static int[] reverseArray(int num[]){
        int start=0;
        int end = num.length-1;
        while(start<end){
            int t= num[start];
            num[start]=num[end];
            num[end]=t;
            start++;
            end--;
        }
        return num;
    }

    public static void pairs(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+num[i]+","+num[j]+")");
            }System.out.println();
        }
    }

    public static void main(String args[]){
        int num[] = {1,2,6,4,9,8,0,55,23};
        int key = 9;
        // int a= linearSearch(num,key);
        // int a= binarySearch(num,key);
        // if(a==-1){
        //     System.out.println("Key not found");
        // }
        // else{
        //     System.out.println("Key found at index "+a);
        // }
        //largestInArray(num);
        // printArray(num);
        // reverseArray(num);
        // printArray(num);
        pairs(num);
    }
    
}
