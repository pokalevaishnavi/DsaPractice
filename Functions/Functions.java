//import java.util.*;

public class Functions {

    // public static int binToDec(int bin){
    //     int dec = 0;
    //     int pow=0;
    //     while(bin!=0){
    //         int ld = bin % 10;
    //         bin = bin/10; 
    //         dec = dec + ld* (int) Math.pow(2, pow);
    //         pow++;
    //     }
    //     return dec;
    // }



    public static int binToDec(int bin) {
        int dec = 0;
        int pow = 0;
        while (bin != 0) {
            int ld = bin % 10;
            // System.out.println("Current binary digit: " + ld);  // Debugging line
            bin = bin / 10; 
            dec = dec + ld * (int) Math.pow(2, pow);
            //System.out.println("Decimal so far: " + dec);  // Debugging line
            pow++;
        }
        return dec;
    }

    public static int DecToBin(int dec){
        int bin = dec%2;
        System.out.println(bin);
        int x=10;
        while(dec>0){

           dec= dec/2; 
           System.out.println(dec);
           bin= bin+((dec%2)*x);
           x*=10;
           System.out.println(bin);
            
        }
        
        return bin;
    }
    


    public static void main(String args []){
        System.out.println(DecToBin(4));
    }
}