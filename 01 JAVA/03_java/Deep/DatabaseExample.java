package Deep;
/*
다음과 같은 출력이 나오도록 앞에서 정의한 Database 클래스를 운영하는 클래스를 정의하세요
 */
public class DatabaseExample {
    public static void main(String[] args) {
        Database database = Database.getInstance();

        database.connect();
        System.out.println("데이터베이스: " + database.getConnection());
        database.close();
    }
}
