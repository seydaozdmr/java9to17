package java10newfeatures;


import org.junit.Test;

public class LocalTypeInference {


    @Test
    public void whenVarInÄ±tWithString_ThenGetStringTypeVar(){
        var message="Hello java";
        assert(message instanceof String);
    }



}
