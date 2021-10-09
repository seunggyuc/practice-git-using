package AbstractDemo;

public class Cuboid extends Rectangle{
    int height;

    public Cuboid(int width, int length, int height) {
        super(width, length); // 부모 클래스의 생성자를 실행
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("직육면체를 그립니다");
    }

    @Override
    public double findVolume() {
        return width*length*height;
    }
}
