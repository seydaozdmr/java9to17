package java15newfeatures;

public record DerivedRecord (String name ,String category) //extends BaseClass{
{
    /**
     * extend edemiyoruz
     * constructor yazabiliyoruz
     */
    public DerivedRecord {
        if ("".equals(category))
            throw new IllegalArgumentException("categori boş olmamalı");
    }
}
