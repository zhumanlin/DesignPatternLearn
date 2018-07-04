package pattern.bridgePattern;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redSingletonCircle = new SingletonCircle(100,100, 10, new RedCircle());
        Shape greenSingletonCircle = new SingletonCircle(100,100, 10, new GreenCircle());
        System.out.println("<------------------------singletonCircle------------------------>");
        redSingletonCircle.draw();
        greenSingletonCircle.draw();
        System.out.println("<-------------------------doubleCircle-------------------------->");
        Shape redDoubleCircle = new DoubleCircle(100, 100, 5, 10, new RedCircle());
        Shape greenDoubleCircle = new DoubleCircle(100, 100, 5, 10, new GreenCircle());
        redDoubleCircle.draw();
        greenDoubleCircle.draw();
    }
}
