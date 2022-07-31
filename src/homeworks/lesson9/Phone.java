package homeworks.lesson9;

public class Phone {
    String title;
    int cardmemory;
    double weight;
    long ramValue;

    public int cardValue(int memory) {
        return memory;
    }

    public String getTitle() {
        return title;
    }

    public void info(String country, String yearOfIssue) {
        System.out.println("Producing country is " + country +
                " ; Year of issue - " + yearOfIssue);
    }

    public int charToInt(char b) {
        return b;
    }
}
