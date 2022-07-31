package homeworks.lesson7;

public class SumNum {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int x = 5;
        for (int i = 0; i <= x; i++) {
            sum += i;

        }
        System.out.println("suma cu for este " + sum);

        int y = 0;
        while (y <= x) {
            sum1 += y;
            y++;
        }
        System.out.println("suma cu while este " + sum1);

        int z = 0;
        do {
            sum2 += z;
            z++;
        } while (z <= x);
        System.out.println("suma cu do while este " + sum2);
    }
}
