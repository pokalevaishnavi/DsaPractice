import java.util.*;

public class WaterConteiner {
    public static int maxArea(int[] height) {
        int dist = 0;
        int ht = 0;
        int maxAmount = 0;
        int water = 0;
        for(int i=0; i<height.length-1;i++){
            for(int j=i+1; j<height.length;j++){
                dist = j - i;
                ht = Math.min(height[i],height[j]);
                water = dist*ht;
                maxAmount = Math.max(water,maxAmount);
        }
        }
        return maxAmount;
    }
    public static void main(String args[]){
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}


