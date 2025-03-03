public class TestTask {
    int radius = 5;

    TestTask(){}

    TestTask(int newRadius){
        radius = newRadius;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    void setRadius(int newRadius){
        radius = newRadius;
    }
}
