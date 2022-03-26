import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return this.pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return this.pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * distance.
     */
    public double distance(Point a) {
        double x = this.getPointX() - a.getPointX();
        double y = this.getPointY() - a.getPointY();

        return Math.sqrt(x * x + y * y);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Point)) {
            return false;
        }
        Point point = (Point) o;
        return Double.compare(point.getPointX(), getPointX()) == 0
                && Double.compare(point.getPointY(), getPointY()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }
}
