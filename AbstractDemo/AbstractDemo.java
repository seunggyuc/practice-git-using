package AbstractDemo;
/*
추상(abstract) 클래스
1) 실체(concrete) 클래스와 다르게 new 키워드로 객체 생성이 불가하다. ( 포유류, 동물, 식물 등등 )
2)

*/

public class AbstractDemo {
    public static void main(String[] args){
//        Shape s1 = new Shape(); // 추상클래스의 객체생성 불가
//        s1.draw();
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(5);

        Rectangle r1 = new Rectangle(3,4);

        Cuboid cu1 = new Cuboid(10,5,10);

        Cylinder cy1 = new Cylinder(5,10);

        r1.draw();
        System.out.println(r1.findArea());

        c1.draw();
        System.out.println(c1.findArea());
        c2.draw();
        System.out.println(c2.findArea());

        cu1.draw();
        System.out.println(cu1.findVolume());

        cy1.draw();
        System.out.println(cy1.findVolume());
    }
}
