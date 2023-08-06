package java17newfeatures.sealed;

/**
 * Currently, Java provides no fine-grained control over the inheritance.
 * Access modifiers such as public, protected, private, as well as the default package-private, provide very coarse-grained control.
 */
public abstract sealed class Person permits Employee,Manager{
}
