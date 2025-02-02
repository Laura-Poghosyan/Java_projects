package Package2;

public class FullTimeEmployee extends Employee{
    private double salary;
    public  FullTimeEmployee(String name, int  employeeId, double salary){
        super(name, employeeId);
        this.salary=salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
