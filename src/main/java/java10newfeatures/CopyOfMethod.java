package java10newfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyOfMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //unmodifiable list
        List<Integer> listCopy = List.copyOf(list);
        //listCopy.add(0,33);
        //listCopy.set(0,10);
        //listCopy.add(44);
        List<Integer> arrays = Arrays.asList(1,2,3,4);
        arrays.set(0,10);
        System.out.println(arrays);

        //Set.copyOf , Map.copyOf
    }
}
