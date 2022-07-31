package homeworks.lesson10.lesson10_3;

import homeworks.lesson10.Car;
import homeworks.lesson10.lesson10_1.Person;
import homeworks.lesson10.lesson10_2.Dog;

public class Test3 {
    public static void main(String[] args) {
        Person p = new Person();
        p.eat();

        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.drink();
        c.play();

        Car car = new Car();
        car.startEngine();
    }
}
