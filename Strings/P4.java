public class P4 {
    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'N') {
                x++;
            } else if (dir == 'S') {
                x--;
            } else if (dir == 'E') {
                y++;
            } else if (dir == 'W') {
                y--;
            }
        }
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));

    }
}
