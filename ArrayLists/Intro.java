import java.util.*;


public class Intro{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        System.out.println(list);

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        System.out.println(list.get(2));

        list.remove(2);
        list.remove(3);

        System.out.println(list);

        list.set(2,5);
        System.out.println(list);

        System.out.println(list.contains(1));
        System.out.println(list.contains(90));

        
    }
}