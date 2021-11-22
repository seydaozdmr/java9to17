package java10newfeatures;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UnmodifiableCollections {

    public static List<Integer> genereteList(){
        List<Integer> myList=new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        return myList;
    }

    @Test(expected = UnsupportedOperationException.class)
    public void whenModifyCopyOfList_thenThrowsException(){
        List<Integer> list=List.copyOf(genereteList());
        list.add(4);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void whenModifyToUnmodifiableList_thenThrowsException() {
        List<Integer> evenList = genereteList().stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toUnmodifiableList());
        evenList.add(4);
    }
}
