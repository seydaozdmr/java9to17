package java12newfeatures;

import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static junit.framework.TestCase.assertEquals;


public class TeeingCollector {

    //It is a composite of two downstream collectors.
    @Test
    public void givenSetOfNumbers_thenCalculateAverage() {
        double mean = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(Collectors.summingDouble(i -> i),
                        Collectors.counting(), (sum, count) -> sum / count));
        assertEquals(3.0, mean);
    }
}
