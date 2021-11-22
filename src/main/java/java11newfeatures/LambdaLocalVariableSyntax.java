package java11newfeatures;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class LambdaLocalVariableSyntax {
    public static void main(String[] args) {
        List<String> sampleList = Arrays.asList("Java", "Kotlin");
        String resultString = sampleList.stream()
                .map((var x) -> x.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.println(resultString);
    }
    @Test
    public void testLocalVariable(){
        List<String> sampleList = Arrays.asList("Java", "Kotlin");
        String resultString = sampleList.stream()
                .map(( var x) -> x.toUpperCase())
                .collect(Collectors.joining(", "));
        assertEquals(resultString,"JAVA, KOTLİN");
    }
}
