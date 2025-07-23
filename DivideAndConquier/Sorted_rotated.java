import java.util.*;

public class Sorted_rotated{
    public static int searchInSortedRotated(int[] n, int t,int start,int end){ 
        if(start>end){
            return -1;
        }
        int mid = start + (end - start)/2 ;

        if(n[mid]==t){
            return mid;
        }


        if(n[mid]>n[start]){
            if(t<= n[mid] && t>= n[start]){
                return searchInSortedRotated(n,t,start,mid-1);
            }else{
                return searchInSortedRotated(n,t,mid+1,end);
            }
        }
        
        else{
            if(t<= n[end] && t>= n[mid]){
                return searchInSortedRotated(n,t,mid+1,end);
            }else{
                return searchInSortedRotated(n,t,start,mid-1);
            }
        }   
        
    }
    public static void main(String args[]){
        int n[] = {10,16,6,7,8,9};
        int start = 0;
        int end = n.length-1;
        int a = searchInSortedRotated(n,7,start,end);
        if(a == -1){
            System.out.println("not found");
        }else{
            System.out.println("Found at "+ a);
        }
        
    }
}