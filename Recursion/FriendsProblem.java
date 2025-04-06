class FriendsProblem{
    public static int ways(int n){
        if(n == 1 || n == 2){
            return n;
        }

        int single = ways(n-1);

        int pair = (n-1)*ways(n-2);

        int totWays = single + pair;

        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(ways(3));
    }
}