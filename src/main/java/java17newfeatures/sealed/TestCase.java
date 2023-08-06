package java17newfeatures.sealed;

public class TestCase {
    public static void main(String[] args) {
        Person e = new Employee();

        if(e instanceof Employee employee)
            System.out.println(employee.name);

        if(e instanceof Manager manager)
            System.out.println(manager.age);

    }
}
