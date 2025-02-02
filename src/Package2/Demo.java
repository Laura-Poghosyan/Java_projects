package Package2;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle("red", 5), new Rectangle("blue", 5, 9)};
        for (Shape sh : shapes) {
            sh.draw();
        }
    }
}