class TilingProblem{
    public static int ways(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        int verticalWays = ways(n-1);

        int horizontalWays = ways(n-2);

        int totWays = verticalWays + horizontalWays;

        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(ways(3));
    }
}