package package1;

public class Triangle {
    private Point leftPoint;
    private Point rightPoint;
    private Point apex;

    // Six-parameterized constructor
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.leftPoint = new Point(x1, y1);
        this.rightPoint = new Point(x2, y2);
        this.apex = new Point(x3, y3);
    }

    // Three-parameterized constructor of Point type
    public Triangle(Point leftPoint, Point rightPoint, Point apex) {
        this.leftPoint = leftPoint;
        this.rightPoint = rightPoint;
        this.apex = apex;
    }

    // Copy constructor
    public Triangle(Triangle other) {
        this.leftPoint = new Point(other.leftPoint);
        this.rightPoint = new Point(other.rightPoint);
        this.apex = new Point(other.apex);
    }

    // Accessors for Points
    public Point getLeftPoint() {
        return leftPoint;
    }

    public Point getRightPoint() {
        return rightPoint;
    }

    public Point getApex() {
        return apex;
    }

    // Mutators for Points
    public void setLeftPoint(Point leftPoint) {
        this.leftPoint = leftPoint;
    }

    public void setRightPoint(Point rightPoint) {
        this.rightPoint = rightPoint;
    }

    public void setApex(Point apex) {
        this.apex = apex;
    }

    // Accessors for x and y coordinates of each vertex
    public double getLeftPointX() {
        return leftPoint.getX();
    }

    public double getLeftPointY() {
        return leftPoint.getY();
    }

    public double getRightPointX() {
        return rightPoint.getX();
    }

    public double getRightPointY() {
        return rightPoint.getY();
    }

    public double getApexX() {
        return apex.getX();
    }

    public double getApexY() {
        return apex.getY();
    }

    // Mutators for x and y coordinates of each vertex
    public void setLeftPointX(double x) {
        leftPoint.setX(x);
    }

    public void setLeftPointY(double y) {
        leftPoint.setY(y);
    }

    public void setRightPointX(double x) {
        rightPoint.setX(x);
    }

    public void setRightPointY(double y) {
        rightPoint.setY(y);
    }

    public void setApexX(double x) {
        apex.setX(x);
    }

    public void setApexY(double y) {
        apex.setY(y);
    }

    // Method to calculate the perimeter of the triangle using Line's length method
    public double perimeter() {
        // Create Line objects for each side of the triangle
        Line leftSide = new Line(leftPoint, rightPoint);
        Line rightSide = new Line(rightPoint, apex);
        Line apexSide = new Line(apex, leftPoint);

        // Calculate and return the perimeter using the length method of the Line class
        return leftSide.length() + rightSide.length() + apexSide.length();
    }

    // Method to calculate the center of mass of the triangle

    public Point centerOfMass(Point leftPoint, Point rightPoint, Point apex) {
        double xG = (leftPoint.getX() + rightPoint.getX() + apex.getX()) / 3;
        double yG = (leftPoint.getY() + rightPoint.getY() + apex.getY()) / 3;
    return new Point(xG,yG);
    }

    

}
