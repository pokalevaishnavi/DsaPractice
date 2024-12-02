import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Sorting {
    
    public static void printArray(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }

    public static void bubbleSort(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length-i-1;j++){
                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
    }


    public static void selectionSort(int num[]){
        
        for(int i=0;i<num.length-1;i++){
            int min = i;
            for (int j = i+1; j < num.length; j++) {
                if(num[min]>num[j]){
                    min=j;
                }
            }
            int temp = num[i];
            num[i]=num[min];
            num[min]=temp;
           
        }
    }

    public static void insertionSort(int num[]){
        for(int i=1; i<num.length;i++ ){
            int curr=num[i];
            int prev=i-1;
            while( prev>=0 && num[prev] > curr){
                num[prev+1]=num[prev];
                prev--;
            }
            num[prev+1]=curr;
        }
    }

    public static void countingSort(int num[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i < num.length; i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        int arr[] = new int[max+1];
        
        for(int i=0; i < num.length; i++){
            
            arr[num[i]]++;
        }
        int j=0;
        for(int i=0; i<=max;i++){
            while(arr[i]>0){
                num[j]=i;
                arr[i]--;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int num[] = {5,4,1,8,4,2};
        printArray(num);
        // bubbleSort(num);
        //selectionSort(num);
        //insertionSort(num);
        // /Arrays.sort(num);
        //(works on only objects not premitives like int)Arrays.sort(num,Collections.reverseOrder())
        countingSort(num);
        printArray(num);
    }
    
}
