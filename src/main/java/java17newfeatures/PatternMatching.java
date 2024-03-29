package java17newfeatures;

import java.awt.*;

public class PatternMatching {

    static record Human (String name, int age, String profession) {}

    public static String checkObject(Object obj) {
        return switch (obj) {
            case Human h -> "Name: %s, age: %s and profession: %s".formatted(h.name(), h.age(), h.profession());
            case Circle c -> "This is a circle";
            case Shape s -> "It is just a shape";
            case null -> "It is null";
            default -> "It is an object";
        };
    }

    public static String checkShape(Shape shape) {
        return switch (shape) {
            case Triangle t && (t.getNumberOfSides() != 3) -> "This is a weird triangle";
            case Circle c && (c.getNumberOfSides() != 0) -> "This is a weird circle";
            default -> "Just a normal shape";
        };
    }

    public static void main(String[] args) {
        Human h = new Human("ali",10,"dev");
        System.out.println(checkObject(h));
    }

}
