package java15newfeatures;

public class TextBlocks {

    /**
     * Text blocks are available in Java 13 and 14 as a preview feature and from Java 15 as a standard feature.
     */
    public static void main(String[] args) {
        String TEXT_BLOCK_JSON = """
            {
                "name" : "Turkcell",
                "website" : "https://www.turkcell.com.tr/"
            }
            """;

        System.out.println(TEXT_BLOCK_JSON);
    }

    /**
     * stripIndent() – mimics the compiler to remove incidental white space
     * translateEscapes() – translates escape sequences such as “\\t” to “\t”
     * formatted() – works the same as String::format, but for text blocks
     */
}
