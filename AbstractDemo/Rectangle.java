package AbstractDemo;

public class Rectangle extends Shape{
    int width, length;
    // 생성자 단축키 Alt + Insert

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    void draw() {
        System.out.println("사각형을 그립니다!");
    }

    @Override
    public double findArea() {
        return width*length;
    }
}


