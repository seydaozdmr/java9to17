package java10newfeatures;


import org.junit.Test;

public class LocalTypeInference {


    @Test
    public void whenVarInıtWithString_ThenGetStringTypeVar(){
        var message="Hello java";
        assert(message instanceof String);

        // var v = null; - not allowed
        // var v; - not allowed
        //private var name; -- not allowed
        // var z = (int x, int y)-> x+y; -- not allowed (cannot use as lambda)

    }



}
