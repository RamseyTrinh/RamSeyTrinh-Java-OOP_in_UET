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

    public String toString() {
        return "Square[side=" + this.length + ",color=" + color + ",filled=" + filled + "]";
    }

}
