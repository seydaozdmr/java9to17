package java13newfeatures;

public class TextBlocks {
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
