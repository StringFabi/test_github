package htl;

import java.util.ArrayList;
import java.util.List;

class Group {
    private List<Shape> shapes;

    public Group() {
        shapes = new ArrayList<>();
    }

    /**
     * Adds a shape to the group.
     *
     * @param shape The shape to be added.
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Removes a shape from the group.
     *
     * @param shape The shape to be removed.
     */
    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    /**
     * Calculates the total area of all shapes in the group.
     *
     * @return The total area of all shapes in the group.
     */
    public double calculateTotalArea() {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    /**
     * Calculates the total circumference of all shapes in the group.
     *
     * @return The total circumference of all shapes in the group.
     */
    public double calculateTotalCircumference() {
        double totalCircumference = 0.0;
        for (Shape shape : shapes) {
            totalCircumference += shape.calculateCircumference();
        }
        return totalCircumference;
    }

    /**
     * Finds the largest shape in the group based on the area.
     *
     * @return The largest shape in the group.
     */
    public Shape findLargestShape() {
        if (shapes.isEmpty()) {
            return null;
        }

        Shape largestShape = shapes.get(0);
        double largestArea = largestShape.calculateArea();

        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            if (area > largestArea) {
                largestArea = area;
                largestShape = shape;
            }
        }

        return largestShape;
    }

    /**
     * Prints information about all shapes in the group to the console.
     */
    public void printAllShapes() {
        for (Shape shape : shapes) {
            System.out.println("Shape Type: " + shape.getClass().getSimpleName());
            System.out.println("Position: (" + shape.x + ", " + shape.y + ")");
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Circumference: " + shape.calculateCircumference());
            System.out.println();
        }
    }
}