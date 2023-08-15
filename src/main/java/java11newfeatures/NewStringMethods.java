package java11newfeatures;

import java.util.stream.Collectors;

public class NewStringMethods {
    public static void main(String[] args) {
        System.out.println(" ".isBlank()); //true

        String test = "";
        System.out.println(test.isBlank());

        String s = "Anupam";
        System.out.println(s.isBlank()); //false
        String s1 = "";
        System.out.println(s1.isBlank()); //true

        String str2 = "Hello\nJava\nCommunity";
        System.out.println(str2);
        System.out.println(str2.lines().collect(Collectors.toList()));

        String str = " JC ";
        System.out.print("Start");
        System.out.print(str.strip());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(str.stripLeading());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(str.stripTrailing());
        System.out.println("End");

        String strn = "=".repeat(2);
        System.out.println(strn); //prints ==

    }
}
