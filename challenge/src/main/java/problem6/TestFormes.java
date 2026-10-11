package problem6;

public class TestFormes {

    public static void main(String[] argv) {

        Forme[] figures = new Forme[3];

        figures[0] = new Square(2);
        figures[1] = new Circle(3);
        figures[2] = new Square(5.2);

        for (int i = 0; i < figures.length; i++) {

            double area = figures[i].getSurface();

            System.out.print(figures[i] + ": area = ");

            if (area == (int) area) {
                System.out.println(area + " cm2");
            } else {
                System.out.printf("%.2f cm2%n", area);
            }
        }
    }
}
