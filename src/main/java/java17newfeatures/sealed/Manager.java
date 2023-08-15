package java17newfeatures.sealed;

public sealed class Manager  extends Person permits Supervisor{
    int age;
}
