class EvenOdd{
    public static void main(String args[]){
        int n = 5;
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}