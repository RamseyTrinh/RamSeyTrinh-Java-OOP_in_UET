public class Cylinder extends Circle {
    private double height = 1.0;

    protected static final double PI = 3.14;

    public Cylinder() {
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {

    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[height=" + height + "," + super.toString() + "]";
    }

    @Override
    public double getArea() {
        return 2.0 * PI * getRadius() * height;
    }

}
