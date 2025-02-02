package package1;

public class Point {
    private double x;
    private double y;

    // Default constructor
    public Point(){
        this.x=0;
        this.y=0;
    }

    // Parameterized constructor
    public Point(double x, double y) {
        this.x=x;
        this.y=y;
    }

    // Copy constructor
    public Point(Point copy) {
        this.x=copy.x;
        this.y=copy.y;
    }

    // Accessor for x
    public double getX() {
        return x;
    }

    // Accessor for y
    public double getY() {
        return y;
    }

    // Mutator for y
    public void setY(double y) {
        this.y = y;

    }
    // Mutator for y that assigns a new value and returns it
    public double setNewY(double y){
        this.y=y;
        return this.y;
    }

    // Mutator for x
    public void setX(double x) {
        this.x = x;
    }
        // Mutator for x that assigns a new value and returns it
        public double setNewX(double x) {
            this.x=x;
            return this.x;
        }

        //@Override: toString() method
        public String toString(){
        return "point("+ x + "," + y+")";
        }
    }
