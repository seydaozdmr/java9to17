package java10newfeatures;


import org.junit.Test;

public class LocalTypeInference {


    @Test
    public void whenVarInıtWithString_ThenGetStringTypeVar(){
        var message="Hello java";
        assert(message instanceof String);
    }



}
