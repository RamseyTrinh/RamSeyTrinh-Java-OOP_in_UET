import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void addShape(Shape a) {
        shapes.add(a);
    }

    /**
     * remove all circles.
     */

    public void removeCircles() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
            }
        }
    }

    /**
     * get all Shape info.
     */

    public String getInfo() {
        String a = "Layer of crazy shapes:\n";
        for (int i = 0; i < shapes.size(); i++) {
            a = a + shapes.get(i).toString() + "\n";
        }
        return a;
    }

    /**
     * remove all same shape.
     */

    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    shapes.remove(j);
                    j--;
                }
            }
        }
    }
}
