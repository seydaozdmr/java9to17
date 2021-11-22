package java9newfeatures;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiImprovement {

    public static void main(String[] args) {
        List<Integer> list
                = Stream.of(2,2,3,4,5,6,7,8,9,10)
                .takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(list);

        Stream.of("a","b","c","","e","f").dropWhile(s-> !s.isEmpty())
                .forEach(System.out::print);

        System.out.println();
        Stream.of("a","b","c","","e","","f")
                                        .dropWhile(s-> !s.isEmpty())
                                        .forEach(System.out::print);

        IntStream.iterate(0,x->x<100,x->x+=1)
                .forEach(System.out::println);
    }
}
