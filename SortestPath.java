public class SortestPath {
    static void SoPath(String way){
        int x = 0, y=0;
        for(int i=0; i<way.length(); i++){
            char direction = way.charAt(i);
            if(direction=='N'){
                y++;
            }else if (direction=='S') {
                y--;                
            }else if(direction=='W'){
                x--;
            }else{
                x++;
            }
           
        }
        double sp = (x*x+y*y);
        System.out.println(Math.sqrt(sp));
    }
    public static void main(String[] args) {
        String way = "WNEENESENNN";
        System.out.println(way);
        System.out.println("Your Sortest Path is:\n");
        SoPath(way);
    }
}
