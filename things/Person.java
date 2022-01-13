package things;

public class Person {
    public static String DEFAULT_NAME = "";
    public static int DEFAULT_AGE = 0;

    String name;
    int age;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Person create()
    {
        return new Person(Person.DEFAULT_NAME, Person.DEFAULT_AGE);
    }

    public Person setName(String name) {
        this.name = name;

        return this;
    }

    public Person setAge(int age) {
        this.age = age;

        return this;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Person: Name is " + this.name + ". Age is " + this.age + ".";
    }
}

