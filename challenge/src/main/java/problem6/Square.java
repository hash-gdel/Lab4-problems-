package problem6;

public class Square extends Forme {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getSurface() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square (side " + side + " cm)";
    }
}
