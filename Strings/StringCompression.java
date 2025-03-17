

public class StringCompression {

    public static String compressString(String s) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            Integer count = 1;
            while (i < s.length()-1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(s.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbcccd";
        System.err.println(compressString(str));
    }
}
