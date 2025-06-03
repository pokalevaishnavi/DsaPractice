import java.util.*;

public class WaterConteiner2 {
 
    public static int maxArea(int[] height) {
        int dist = 0;
        int ht = 0;
        int left = 0;
        int right = height.length-1;
        int maxAmount = 0;
        int water = 0;
        while(left<right){
            dist = right-left;
            ht = Math.min(height[left],height[right]);
            water = dist*ht;
            maxAmount = Math.max(water,maxAmount);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxAmount;
    }

    public static void main(String args[]){
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}