public class ShortestPath{

    public static float shortestPath(String p){
        int x = 0;
        int y = 0;

        for(int i=0; i<p.length(); i++){
            if(p.charAt(i) == 'E'){
                x++;
            }else if(p.charAt(i) == 'W'){
                x--;
            }else if(p.charAt(i) == 'N'){
                y++;
            }else{
                y--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;

        return (float)Math.sqrt(x2 +y2);
    }
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.err.println(shortestPath(path));
    }
}