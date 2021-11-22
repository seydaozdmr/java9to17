package java11newfeatures;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
public class NotPredicate {

    @Test
    public void whenPredicateNotStringIsBlank(){
        List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
        List withoutBlanks = sampleList.stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());
        assertEquals(withoutBlanks,List.of("Java", "Kotlin"));
    }
}
