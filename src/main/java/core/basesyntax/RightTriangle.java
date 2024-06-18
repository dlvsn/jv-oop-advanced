package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstSide;
    private int secondSide;

    public RightTriangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getArea() {
        return 0.5 * firstSide * secondSide;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("\nFigure: RightTriangle, "
                + "area: "
                + getArea()
                + " units, side: "
                + firstSide
                + " units, side: "
                + secondSide
                + " units, color:"
                + getColor());
    }
}
