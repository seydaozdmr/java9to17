package java10newfeatures;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.hamcrest.CoreMatchers.is;

public class OptionalOrElseThrown {
    public static List<Integer> genereteList(){
        List<Integer> myList=new ArrayList<>();
        myList.add(1);
        //myList.add(2);
        myList.add(3);
        return myList;
    }

    @Test
    public void whenListContainsInteger_OrElseThrowReturnsInteger() {
        Integer firstEven = genereteList().stream()
                .filter(i -> i % 2 == 0)
                .findFirst()
                .orElseThrow(()->new NoSuchElementException("eleman bulunamadı"));
        is(firstEven).equals(Integer.valueOf(2));
    }
}
