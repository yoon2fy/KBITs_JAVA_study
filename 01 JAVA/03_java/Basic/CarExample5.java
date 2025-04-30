package Basic;

public class CarExample5 {
    public static void main(String[] args) {
        //Car 객체 생성
        Car5 myCar = new Car5();

        //리턴값이 없는 setGas () 메소드 호출
        myCar.setGas(5);

        //isLeftGas () 메소드를 호출해서 받은 리턴값이 true 일 경우 if 블록 실행
        if(myCar.isLeftGas ()) {
            System.out.println("출발합니다.");

            //리턴값이 없는 run() 메소드 호출
            myCar.run();
        }
        System.out.println("gas를 주입하세요.");
    }
}
/*
gas가 있습니다.
출발합니다.
달립니다.(gas 잔량 :5)
달립니다.(gas 잔량 :4)
달립니다.(gas 잔량 :3)
달립니다.(gas 잔량 :2)
달립니다.(gas 잔량 :1)
멈춥니다.(gas 잔량 :0)
gas를 주입하세요.
 */