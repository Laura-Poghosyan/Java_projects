package Package2;

public class Employee {
    private  String name;
private int    employeeId;
public Employee(String name, int employeeId){
    this.name=name;
    this.employeeId=employeeId;
}
public String getDetails(){
    return "Employee : "+ name + "Employe id: " + employeeId;
}

public double calculateSalary (){
    return 0.0;
}

}
