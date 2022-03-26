public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        this.length = side;
        this.width = side;
    }

    /**
     * Trinh Xuan Hoang Square.
     */
    public Square(double side, String color, boolean filled) {
        super();
        this.length = side;
        this.width = side;

    }

    /**
     * contructors full.
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    public double getSide() {
        return this.length;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    public String toString() {
        return "Square[topLeft=" + topLeft + ",side=" + this.length + ",color=" + color + ",filled="
                + filled + "]";
    }

}
