package pattern.bridgePattern;

public class DoubleCircle extends Shape {
    private int x, y, inRadius, outRadius;
    protected DoubleCircle(int x,int y,int inRadius,int outRadius,DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.inRadius = inRadius;
        this.outRadius = outRadius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(inRadius, x, y);
        drawAPI.drawCircle(outRadius, x, y);
    }
}
