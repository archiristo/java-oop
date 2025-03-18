import java.util.ArrayList;

public class empdepMain {
    public static void main(String[] args) {

        Employee emp = new Employee("John Doe", 101);
        Employee emp2 = new Employee("Jane Smith", 102);
        Employee emp3 = new Employee();
        Department IT  = new Department("IT Department", new ArrayList<>());
        Department HR = new Department("HR Department", new ArrayList<>());

        IT.addEmployee(emp);
        IT.addEmployee(emp2);
        IT.addEmployee(emp3);

        System.out.println("IT Department Employees: ");
        IT.showEmployees();
        System.out.println("HR Department Employees: ");
        HR.showEmployees();

        IT.removeEmployee(emp2);
        HR.addEmployee(emp2);

        System.out.println();

        System.out.println("Updated IT Department Employees: ");
        IT.showEmployees();
        System.out.println("Updated HR Department Employees: ");
        HR.showEmployees();

    }
}
