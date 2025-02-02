package Package2;

public class Circle extends Shape {
 private double radius;


 //Constructor
    public Circle(String color, double radius) {

        super(color);
        this.radius=radius;
    }
    @Override
    public void draw(){
        System.out.println("draw " + getColor()+ " circle  with radius " + radius);
    }
}
