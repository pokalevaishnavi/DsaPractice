class BinaryStringsProb{

    public static void strng(StringBuilder str,int prev,int n){
    if(n == 0){
        System.out.println(str);
        return;
    }
    strng(str.append("0"), 0, n-1);
    str.deleteCharAt(str.length()-1);
    if(prev == 0){
        strng(str.append("1"), 1, n-1);
        str.deleteCharAt(str.length()-1);
    }


    }
    public static void main(String[] args) {
        strng(new StringBuilder(""), 0, 4);
    }
}