
import java.util.*;

public class LargestString{

    public static String largeString(String seq[]){
        String largest = seq[0];

        for(int i=1; i<seq.length; i++){
            if(largest.compareTo(seq[i]) < 0){
                largest = seq[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){
        String seq[] = {"apple","mango","banana"};
        System.out.println(largeString(seq)); 
    }
}