package pattern.prototypePattern;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
    public static Shape getShape(String shapeId){
        Shape cacheShape = shapeMap.get(shapeId);
        return (Shape) cacheShape.clone();
    }
    public static void loadShape(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put("1", circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put("2", rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put("3", square);
    }
}
