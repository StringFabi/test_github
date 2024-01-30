package htl;


/**
 * Represents a geometric shape with a position and methods to calculate area and circumference.
 */
abstract class Shape {
    protected double x;
    protected double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Calculates the area of the shape.
     *
     * @return The area of the shape.
     */
    abstract double calculateArea();

    /**
     * Calculates the circumference of the shape.
     *
     * @return The circumference of the shape.
     */
    abstract double calculateCircumference();
}

/**
 * Represents a rectangle.
 */