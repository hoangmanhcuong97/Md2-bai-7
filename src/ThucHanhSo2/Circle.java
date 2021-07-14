package ThucHanhSo2;

public class Circle {
    private double radius = 1.0;
    private String color = "black";
    private boolean filled = false;
    public static final int PI = 3;

    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.color = color;
        this.radius = radius;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return this.radius * this.radius * PI;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + getRadius() +
                ", color = " + getColor() +
                ", Area circle = "+ getArea() +
                '}';
    }
}
