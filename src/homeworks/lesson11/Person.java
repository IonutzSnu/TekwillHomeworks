package homeworks.lesson11;

public class Person {
    private Long id;
    private String firstName;
    private String lastNane;

    public static int p = 0;

    public Person() {
        p++;
    }

    public void setId(long cId) {
        id = cId;
    }

    public long getId() {
        return id;
    }
}
