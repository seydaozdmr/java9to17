package java9newfeatures;

public class DiamondOperator {

    //Anonim sınıfı yaratırken diamond içinde tip belirtmeye gerek yok
    public StringAppender<String> appender = new StringAppender<String>() {
        @Override
        public String append(String a, String b) {
            return null;
        }
    };


    public abstract static class StringAppender<T> {
        public abstract T append (String a,String b);
    }
}


