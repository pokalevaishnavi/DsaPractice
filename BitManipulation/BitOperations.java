class BitOperations{

    public static int getIthBit(int n,int i){
        int bitmask = 1 << i;
        if((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n,int i){
        int bitmask = ~(1 << i);
        return n&bitmask;
    }

    public static int clearIthBit(int n,int i){
        int bitmask = 1 << i;
        return n|bitmask;
    }

    public static int updateIthBit(int n,int i, int j){
        int bitmask = 1 << i;
        if(j == 0){
            return clearIthBit(n, i);
            
        }else{
           return  setIthBit(n, i);
        }
    }

    public static int clearLastIBits(int n,int i){
        int bitmask = (~0) << i;
        return n&bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearLastIBits(3, 1));
    }
}