package Experiment07;

public class Area {
    // cube
    double area(double side) {
        return 6 * side * side;
    }

    // cuboid
    double area(double length, double breadth, double height) {
        return 2 * (length * breadth + breadth * height + height * length);
    }

    // sphere
    double area(float radius) {
        return 4 * Math.PI * radius * radius;
    }
}


