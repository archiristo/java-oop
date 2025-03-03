public class StudentMain {
    public static void main(String[] args) {
        Student std1 = new Student("Alice", "Johnson", 101);
        Student std2 = new Student("Bob", "Smith", 102);

        std1.addGrade(85);
        std1.addGrade(90);
        std1.addGrade(78);

        std2.addGrade(92);
        std2.addGrade(88);
        std2.addGrade(75);

        std1.displayInfo();
        std2.displayInfo();

    }
}
