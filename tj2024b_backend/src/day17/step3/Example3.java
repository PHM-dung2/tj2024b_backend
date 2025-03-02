package day17.step3;


class Car {
    Tire tire;
    public void run(){  this.tire.roll();    }
}
interface Tire {
    void roll();
}
class HankookTire implements Tire {
    @Override
    public void roll(){
        System.out.println("한국 타이어가 회전합니다.");
    }
}
class KumhoTire implements Tire {
    @Override
    public void roll(){
        System.out.println("금호 타이어가 회전합니다.");
    }
}


public class Example3 {
    public static void main(String[] args) {

        Car myCar = new Car();
        // myCar.run();
        @SuppressWarnings("unused")
		Car yourCar = new Car();
        //yourCar.tire = new Tire(); // 인터페이스는 추상 메소드만을 포함하며 구현 클래스를 통해 구현하므로 객체를 생성하지 못한다.
        //yourCar.run();

        //myCar.tire = new Tire();
        //myCar.run();

        myCar.tire = new HankookTire();
        myCar.run();

        myCar.tire = new KumhoTire();
        myCar.run();
        //yourCar.run();

        System.out.println( myCar.tire instanceof KumhoTire);
        
        if( myCar.tire instanceof Tire){
            myCar.tire = new HankookTire();
        }
        myCar.run();
    }
}
