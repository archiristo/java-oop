import java.util.ArrayList;

public class Student {
    private String name;
    private String surname;
    private int id;
    private ArrayList<Integer> grades;

    public Student(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int newGrade){
        grades.add(newGrade);
        System.out.println(name + " new grade " + newGrade);
    }

    public double calculateAverage(){
        if (grades.isEmpty()){
            return 0;
        }
        int sum = 0;
        for (int grade : grades){
            sum += grade;
        }
        return (double) sum / grades.size();
    }
    public void displayInfo(){
        System.out.printf("Student: %s %s, ID: %d, Average Grade: %.2f%n", name, surname, id, calculateAverage());

    }
}
