package Collection;
/*
다음 Member 클래스를 Set에 저장하기위한 클래스로 수정하세요.
 */
public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // hashCode 재정의
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    // equals 재정의
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) {
            return target.name.equals(name) && target.age == age;
        } else {
            return false;
        }
    }
}