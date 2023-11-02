import java.util.*;

public class P4 {
    public static void main(String[] args) {
        // Calculator Cal = new Calculator();
        // System.out.println(Cal.sum(5, 10));
        // System.out.println(Cal.sum((float) 5.5, (float) 10.5));
        // System.out.println(Cal.sum(5, 10, 20));

        Jain Parv = new Jain();
        Parv.eat();
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

class Human {
    void eat() {
        System.out.println("Eats Anything");
    }
}

class Jain extends Human {
    void eat() {
        System.out.println("Eats Jain Food");
    }
}