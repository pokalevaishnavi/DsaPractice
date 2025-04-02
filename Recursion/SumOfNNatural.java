public class SumOfNNatural{
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        int prevSum = sum(n-1);
        int sum = n + prevSum;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(3));
    }
}