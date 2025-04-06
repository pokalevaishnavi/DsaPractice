
class RemoveDuplicates{

    public static void remove(String a, boolean  map[], int i,StringBuilder sb){
        if(i == a.length()){
            System.out.println(sb);
            return;
        }
        if(map[a.charAt(i)-'a'] == false){
            sb.append(a.charAt(i));
            map[a.charAt(i)-'a'] = true;
        }
        remove(a, map, i+1, sb);
    }
    public static void main(String[] args) {
        boolean map[] = new boolean[26];
        int i = 0;
        StringBuilder sb = new StringBuilder();
        String a = "lalaaabmpaaa";
        remove(a,map,i,sb);

    }
}