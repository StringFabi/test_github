package htl;

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double x, double y, double length, double width) {
        super(x, y);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculateCircumference() {
        return 2 * (length + width);
    }
}

/**
 * Represents a circle.
 */
