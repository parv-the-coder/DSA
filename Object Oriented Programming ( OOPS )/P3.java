import java.util.*;

public class P3 {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        Dog rocky = new Dog();
        rocky.legs = 4;
        rocky.breed = "Lab";
        System.out.println(rocky.legs);
    }
}

class Animal {
    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims");
    }
}

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}