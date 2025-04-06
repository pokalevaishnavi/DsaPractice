class XToPowerN{

    public static int pwr(int a, int b){
        if(b == 0){
            return 1;
        }
        int ans =  a * pwr(a,b-1);

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(pwr(2,3));
    }
}