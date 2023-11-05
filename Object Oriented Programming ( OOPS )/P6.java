import java.util.*;

public class P6 {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        Rook r = new Rook();
        r.moves();
    }
}

interface Chess {
    void moves();
}

class Queen implements Chess {
    public void moves() {
        System.out.println("up down right left diagonal in all directoion(in all directions)");
    }
}

class Rook implements Chess {
    public void moves() {
        System.out.println("up down right left diagonal ");
    }
}