package Package2;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width=width;
        this.height=height;

    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle "+ getColor()+" with " +width + " " + " height " +height);

    }

}
