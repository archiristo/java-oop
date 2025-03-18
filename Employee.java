public class Employee {
    String name;
    int id;

    public Employee() {
        name = "Lisa";
        id = 0;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}
