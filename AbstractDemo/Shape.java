package AbstractDemo;

public abstract class Shape {
    // 필드, 생성자, 메서드
    abstract void draw(); // 상속을 자식 클래스로 하여금 draw 메서드를 구현하도록 강제함.

    public double findVolume(){  // 구현하는것을 강제하지는 않음.
        return 0.0;
    }

    public double findArea(){  // 구현하는것을 강제하지는 않음.
        return 0.0;
    }


//    void draw(){
//        System.out.println("도형을 그립니다");
//    }
}
