package java14newfeatures;

public class HelpfulNullPointException {

    public static void main(String[] args) {

        String str = null;
        System.out.println(str.trim());
    }
}

/**
 *
 * Before Java 13
 * Exception in thread "main" java.lang.NullPointerException
 * 	at com.tb.java14.UsefulNullPointerException.main(UsefulNullPointerException.java:6)
 *
 * After Java 13
 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.trim()" because "str" is null
 * 	at com.tb.java14.UsefulNullPointerException.main(UsefulNullPointerException.java:6)
 */
