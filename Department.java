import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name, ArrayList<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
    public void showEmployees() {
        if(employees.isEmpty()){
            System.out.println("Department is empty");
        }
        else{
            for (Employee employee : employees) {
                System.out.println("Employee name: " + employee.getName() + " " + "ID: "+ employee.getId());
            }
            System.out.println();
        }
    }
    public String getName() {
        return name;
    }
}
