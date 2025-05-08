package Deep;

public class ButtonExample1 {
    public static void main(String[] args) {

        //Ok 버튼 객체 생성
        Button1 btnOk = new Button1();

        //Ok 버튼 객체에 ClickListener 구현 객체 주입
        btnOk.setClickListener(new Button1.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        });

        //Ok 버튼 클릭하기
        btnOk.click();
        //Cancel 버튼 객체 생성
        Button1 btnCancel = new Button1();

        //Cancel 버튼 객체에 ClickListener 구현 객체 주입
        btnCancel.setClickListener(new Button1.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        });

        //Cancel 버튼 클릭하기
        btnCancel.click();
    }
}