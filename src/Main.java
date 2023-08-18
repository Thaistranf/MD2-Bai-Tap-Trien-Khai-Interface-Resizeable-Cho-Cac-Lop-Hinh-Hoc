import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int x = (int)Math.floor(Math.random() * 10);
        int y = (int)Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x, "red", true);
        shapes[1] = new Rectangle(x, y, "blue", false);
        shapes[2] = new Square(x, "green", true);
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        for (Shape shape : shapes) {
            shape.resize(Math.random() * 1000);
        }
        System.out.print("\n");
        System.out.println(Arrays.toString(shapes));
    }
}