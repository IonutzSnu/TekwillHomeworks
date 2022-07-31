package homeworks.lesson10.lesson10_2;

import homeworks.lesson10.Car;
import homeworks.lesson10.lesson10_1.Person;
import homeworks.lesson10.lesson10_3.Cat;

public class Test2 {
    public static void main(String[] args) {
        Person p = new Person();
        p.eat();

        Dog d = new Dog();
        d.eat();
        d.drink();
        d.run();

        Cat c = new Cat();
        c.eat();

        Car car = new Car();
        car.startEngine();
    }
}
