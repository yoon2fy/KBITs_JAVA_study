package Deep;

import java.io.Serializable;

public class Member implements Serializable {
    private static final long serialVersionUID = -622284561026719240L;
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return id + ": " + name;
    }
}
