public class PowerOfTwo{
    public static void main(String args[]){
        int n = 5;
        if((n&(n-1))==0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}