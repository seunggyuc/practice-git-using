package AbstractDemo;

public class Cylinder extends Circle {
    int height;

    @Override
    void draw() {
        System.out.println("원통형을 그립니다.");
    }

    public Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double findVolume() {
        return Math.PI * radius * radius * height;
    }
}
