package pattern.prototypePattern;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadShape();
        Shape cloneShape1 = ShapeCache.getShape("1");
        System.out.println("shape:" + cloneShape1.getType());
        cloneShape1.draw();
        Shape cloneShape2 = ShapeCache.getShape("2");
        System.out.println("shape:" + cloneShape2.getType());
        cloneShape2.draw();
        Shape cloneShape3 = ShapeCache.getShape("3");
        System.out.println("shape:" + cloneShape3.getType()+" id:"+cloneShape3.getId());
        cloneShape3.draw();
        Shape cloneShape4 = ShapeCache.getShape("3");
        cloneShape4.setId("4");
        System.out.println("shape:" + cloneShape4.getType()+" id:"+cloneShape4.getId());
        cloneShape4.draw();
    }
}
