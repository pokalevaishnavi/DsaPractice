class XToPowerNOpti{

    public static int pwr(int a, int b){
        if(b == 0){
            return 1;
        }

        int halfPower = pwr(a,(b/2));
        int halfPowerSq = halfPower * halfPower;

        if(b%2 ==0){
            return  halfPowerSq;
        }else{
            return  (a * halfPowerSq);
        }  
    }
    public static void main(String[] args) {
        System.out.println(pwr(2,4));
    }
}