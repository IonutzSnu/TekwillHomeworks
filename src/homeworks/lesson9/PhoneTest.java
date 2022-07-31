package homeworks.lesson9;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.title = "Iphone 13";
        p.weight = 0.650;
        p.ramValue = 32;

        System.out.println("Brand - " + p.getTitle());

        p.cardmemory = p.cardValue(128);
        System.out.println("Card memory is " + p.cardmemory + " Gb");

        p.info("USA", "2021");

        System.out.println(p.charToInt('b'));
    }
}
