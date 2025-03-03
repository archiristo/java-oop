public class TestTaskMain {
    public static void main(String[] args) {
        TestTask tt = new TestTask();
        System.out.println("radius: " + tt.radius + " area: " + (int)tt.getArea() + " perimeter: " + (int)tt.getPerimeter());

        TestTask tt2 = new TestTask(45);
        System.out.println("radius: " + tt2.radius + " area: " + (int)tt2.getArea() + " perimeter: " + (int)tt2.getPerimeter());

        TestTask tt3 = new TestTask(30);
        System.out.println("radius: " + tt3.radius + " area: " + (int)tt3.getArea() + " perimeter: " + (int)tt3.getPerimeter());
    }
}
