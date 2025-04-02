public class DecreasingOrder{
    public static void order(int n){
        if(n < 1){
            return;
        }else if (n == 1) {
            System.out.print(n);
            return;
        }
            System.out.print(n+" ");
            order(n-1);
       
    }
    public static void main(String[] args) {
        order(-1);
    }
}