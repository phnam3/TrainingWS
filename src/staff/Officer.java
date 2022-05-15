package staff;

public class Officer extends Person{
    private Double bSalary;

    public Officer(){};

    public Officer(Double bSalary, String name) {
        super(name);
        this.bSalary = bSalary;
    }

    @Override
    public void display(){
        System.out.println("Name is : " + this.getName() + " Salary is : " + bSalary);
    }

    @Override
    public Double getSalary() {
        return bSalary;
    }

}
