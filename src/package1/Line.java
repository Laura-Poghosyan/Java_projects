package package1;

public class Line {
    private Point point1;
    private Point point2;

    // Four-parameter constructor
    public Line(double x1, double y1, double x2, double y2) {
        this.point1 = new Point(x1, y1);
        this.point2 = new Point(x2, y2);
    }

    // Two-parameter constructor
    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    // Copy constructor
    public Line(Line other) {
        this.point1 = new Point(other.point1);
        this.point2 = new Point(other.point2);
    }

    // Accessor for point1
    public Point getPoint1() {
        return point1;
    }

    // Accessor for point2
    public Point getPoint2() {
        return point2;
    }

    // Mutator for point1 with new Point
    public void setPoint1(Point point) {
        this.point1 = point;
    }

    // Mutator for point2 with new Point
    public void setPoint2(Point point) {
        this.point2 = point;
    }

    // Accessors for coordinates of point1
    public double getPoint1X() {
        return point1.getX();
    }

    public double getPoint1Y() {
        return point1.getY();
    }

    // Accessors for coordinates of point2
    public double getPoint2X() {
        return point2.getX();
    }

    public double getPoint2Y() {
        return point2.getY();
    }

    // Mutators for coordinates of point1
    public void setPoint1X(double x) {
        point1.setX(x);
    }

    public void setPoint1Y(double y) {
        point1.setY(y);
    }

    // Mutators for coordinates of point2
    public void setPoint2X(double x) {
        point2.setX(x);
    }

    public void setPoint2Y(double y) {
        point2.setY(y);
    }

    // Method to calculate the length of the line segment
    public double length() {
        return Math.sqrt((point2.getX() - point1.getX()) * (point2.getX() - point1.getX()) +
                (point2.getY() - point1.getY()) * (point2.getY() - point1.getY()));
    }

    // Method to find the midpoint of the line segment
    public Point midpoint() {
        double midX = (point1.getX() + point2.getX()) / 2;
        double midY = (point1.getY() + point2.getY()) / 2;
        return new Point(midX, midY);
    }


    //@Override:
    public String toString(){
        return "from " + point1 + " to " + point2;
    }
}
