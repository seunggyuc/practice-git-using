package AbstractDemo;

public class Circle extends Shape { // Shape : 부모 Circle : 자식 (상속)
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("원을 그립니다");
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }
}
