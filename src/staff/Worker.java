package staff;

public class Worker extends Person{
    private Double hrs;
    private final double RATE = 5.5;

    public Worker(Double hrs) {
        this.hrs = hrs;
    }

    public Worker(String name, Double hrs) {
        super(name);
        this.hrs = hrs;
    }

    @Override
    public void display(){
        System.out.println("Name is : " +  this.getName() + " Salary is : " + getSalary());
    }

    @Override
    public Double getSalary() {
        return hrs*RATE;
    }
}
