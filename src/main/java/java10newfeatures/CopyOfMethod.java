package java10newfeatures;

import java.util.ArrayList;
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
        //listCopy.add(44);

        //Set.copyOf , Map.copyOf
    }
}
