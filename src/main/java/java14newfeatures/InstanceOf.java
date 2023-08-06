package java14newfeatures;

public class InstanceOf {
    /**
     * Java 14 brings an improved version of the instanceof operator that both tests the parameter and assigns it to a binding variable of the proper type.
     */

    public static void main(String[] args) {

        Fruit fruit = new Apple();

        // Before Java 14
        if (fruit instanceof Orange) {
            Orange orange = (Orange) fruit;
            orange.taste();
        }

        // From Java 14
        if (fruit instanceof Orange orange) {
            orange.taste();
        }
    }


}

abstract class Fruit {
}

class Orange extends Fruit {
    public void taste() {
        System.out.println("Sour");
    }
}

class Apple extends Fruit {
    public void taste() {
        System.out.println("Sweet");
    }
}
