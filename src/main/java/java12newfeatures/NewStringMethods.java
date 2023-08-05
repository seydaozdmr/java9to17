package java12newfeatures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewStringMethods {
    //indent
    @Test
    public void indentString(){
        String testCase = "ankara";
        String indentedCase = testCase.indent(5);
        assertEquals(5,indentedCase.indexOf("ankara"));
    }

    //test transform
    @Test
    public void textTransform(){
        String testCase = "antalya";
        String reversed = testCase.transform(elem -> new StringBuilder(elem).reverse().toString());
        String upperCase = testCase.transform(String::toUpperCase);

        assertEquals("aylatna",reversed);
        assertEquals("ANTALYA",upperCase);
    }
}
