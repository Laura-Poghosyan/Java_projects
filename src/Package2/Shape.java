package Package2;

public abstract class Shape {
    private String color;

    //constructor
    public Shape(String color) {
        this.color=color;
    }

    public String getColor(){
        return color;
    }
    public  abstract void draw();


}

