//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle(5.0, 10.0),
                new Rectangle(4.0, 6.0),
                new Square(3.0)
        };

        System.out.println("Triangulo");
        System.out.println("Area: " + figures[0].calculateArea());
        System.out.println("Numero de lados: " + figures[0].numberOfSides);
        System.out.println();
        System.out.println("Rectangulo");
        System.out.println("Area: " + figures[1].calculateArea());
        System.out.println("Numero de lados: " + figures[1].numberOfSides);
        System.out.println();
        System.out.println("Cuadrado");
        System.out.println("Area: " + figures[2].calculateArea());
        System.out.println("Numero de lados: " + figures[2].numberOfSides);
        System.out.println();

    }
}

abstract class Figure {
    protected int numberOfSides;


    public Figure(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public abstract double calculateArea();

    public int getNumberOfSides() {
        return numberOfSides;
    }
}

class Triangle extends Figure {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Figure {
    private final double width;
    private final double length;

    // Constructor
    public Rectangle(double width, double length) {
        super(4);
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }
}

class Square extends Figure {
    private final double side;

    public Square(double side) {
        super(4);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
