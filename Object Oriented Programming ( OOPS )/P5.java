import java.util.*;

public class P5 {
    public static void main(String[] args) {
        Kohli k = new Kohli();
        Batsman b = new Batsman();
        b.team();
        b.play();
    }
}

abstract class Cricket {
    Cricket() {
        System.out.println("Cricketer constructor called");
    }

    void play() {
        System.out.println("You play good.");
    }

    abstract void team();
}

class Batsman extends Cricket {
    Batsman() {
        System.out.println("Batsman constructor is called");
    }

    void team() {
        System.out.println("India");
    }
}

class Kohli extends Batsman {
    Kohli() {
        System.out.println("I am a King");
    }
}