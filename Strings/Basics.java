public class Basics{
    public static void main(String args[]){
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1 == s2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        if(s1 == s3){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        if(s1.equals(s3)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        //substring
        System.out.println(s1.substring(0,2));

    }
}