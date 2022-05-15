package staff;

public abstract class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public Person(){}

    public Person(String name) {
        this.name = name;
    }

    public abstract void display();
    public abstract Double getSalary();
}

