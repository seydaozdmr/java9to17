package java15newfeatures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RecordTest {
    public static void main(String[] args) {
        RecordClass recordClass = new RecordClass("test", "new type");
        RecordClass recordClass2 = new RecordClass("test", "new type");
        System.out.println(recordClass);
        System.out.println(recordClass == recordClass2);
        System.out.println(recordClass.equals(recordClass2));
        System.out.println(recordClass.hashCode());
        System.out.println(recordClass2.hashCode());

        Set<RecordClass> recordSet = new HashSet<>();
        recordSet.add(recordClass);
        recordSet.add(recordClass2);
        System.out.println(recordSet);

    }
}
