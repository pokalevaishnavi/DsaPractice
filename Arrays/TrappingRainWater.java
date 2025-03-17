package Arrays;

public class TrappingRainWater {

    public static int trappedWater(int[] a){
        //leftMax
        int leftMax[] = new int[a.length];
        leftMax[0] = a[0];
        for(int i=1; i<a.length; i++){
            leftMax[i] = Math.max(a[i],leftMax[i-1]);
        }

        //rightmax
        int rightMax[] = new int[a.length];
        rightMax[a.length-1] = a[a.length-1];
        for(int i=a.length-2; i>=0; i--){
            rightMax[i] = Math.max(a[i],rightMax[i+1]);
        }

        //formula
        int trappedWater = 0;
        for(int i = 0; i<a.length;i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater += waterLevel - a[i];

        }
        return  trappedWater;

    }
    public static void main(String args[]){
        int a[] = {4, 2, 0, 6, 3, 2, 5};
        
        System.out.println(trappedWater(a));
    }
}
