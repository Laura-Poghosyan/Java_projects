package package1;

public class LineDemo {
    public static void main(String[] args) {
        Point startPoint = new Point(1, 5);
        Point endPoint = new Point(2, 8);

        //constructing a line using four-argument constructor
        Line originalLine = new Line(startPoint.getX(), startPoint.getY(), endPoint.getX(), endPoint.getY());

        // calculating the length of the originalLine
        Double length = originalLine.length();
        System.out.println("Length of the line: " + length);

        // calculating the midpoint of the originalLine
        Point midpoint = originalLine.midpoint();
        System.out.println("Midpoint of the original line: (" + midpoint.getX() + ", " + midpoint.getY() + ")");

        //constructing a line using two-parameterized constructor
        Line line = new Line(new Point(4,6), new Point(8,8) );

        // calculating the length of the line
        Double length2=line.length();
        System.out.println("The length of the copied Line is: " + length2);

        // calculating the midpoint of the Line
        Point midpoint2=line.midpoint();
        System.out.println("Midpoint of the line2: " + midpoint2.getX() + " " + midpoint2.getY());

        //creating a copy of the first (originalLine) line using a copy constructor
        Line copy= new Line(originalLine);


        //Changing the startPoint of the originalLine by midpoint of the Line:setting a private field of Point type
        originalLine.setPoint1(midpoint2);
        System.out.println("updated points of the originalLine: " + originalLine.getPoint1X()+ originalLine.getPoint1Y());
        System.out.println("Updated starting point of originalLine: (" + originalLine.getPoint1().getX() + ", " + originalLine.getPoint1().getY() + ")");
        System.out.println("Ending point of originalLine: (" + originalLine.getPoint2().getX() + ", " + originalLine.getPoint2().getY() + ")");


        //Demonstrating the power of toString() method
        System.out.println("The coordinates of the originalLine are" + " " + originalLine);
        System.out.println("The coordinates of the line are" + " " + line);
        System.out.println("The coordinates of the copy line are" + " " + copy);
    }
}