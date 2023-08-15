package java9newfeatures;

import java.util.List;
import java.util.Set;

public class CollectionFactoryMethods {
    public static void main(String[] args) {
        String[] array={"a","b","c"};
        Set<String> set= Set.of(array);

        List<String> test = List.of("ankara","izmir");
        test.remove(0);
    }
}
