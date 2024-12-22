package PatternPrototype;

public class MainPrototype {
    public static void main(String[] args) {

        Circle originalCircle = new Circle(5);
        System.out.println("Original src5.Circle: " + originalCircle);

        Circle clonedCircle = (Circle) originalCircle.clone();
        System.out.println("Copied circle: " + clonedCircle);

        clonedCircle.setRadius(10);
        System.out.println("Copied circle (new radius): " + clonedCircle);
        System.out.println("Original circle: " + originalCircle);

        Rectangle originalRectangle = new Rectangle(4, 6);
        System.out.println("Original rectangle: " + originalRectangle);

        Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();
        System.out.println("Copied rectangle: " + clonedRectangle);

        clonedRectangle.setWidth(8);
        System.out.println("Copied rectangle (with new width): " + clonedRectangle);
        System.out.println("Original rectangle: " + originalRectangle);
    }
}