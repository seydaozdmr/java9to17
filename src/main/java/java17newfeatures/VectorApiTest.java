package java17newfeatures;

import jdk.incubator.vector.FloatVector;
import jdk.incubator.vector.VectorSpecies;

public class VectorApiTest {
    static final VectorSpecies<Float> SPECIES = FloatVector.SPECIES_PREFERRED;
    public static void newVectorComputation(float[] a, float[] b, float[] c) {
        for (var i = 0; i < a.length; i += SPECIES.length()) {
            var m = SPECIES.indexInRange(i, a.length);
            var va = FloatVector.fromArray(SPECIES, a, i, m);
            var vb = FloatVector.fromArray(SPECIES, b, i, m);
            var vc = va.mul(vb);
            vc.intoArray(c, i, m);
        }
    }

    public static void main(String[] args) {
        float [] a = {1.2F,1.3F,1,4F};
        float [] b = {2.2F,2.3F,2,4F};
        float [] c = {3.2F,3.3F,3,4F};

        newVectorComputation(a,b,c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


}
