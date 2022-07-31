package homeworks.lesson10.lesson10_1;

import homeworks.lesson10.Car;
import homeworks.lesson10.lesson10_2.Dog;
import homeworks.lesson10.lesson10_3.Cat;

public class Test1 {
    public static void main(String[] args) {

        Person p = new Person();
        p.eat();
        p.read();
        p.drink();

        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();

        Car car = new Car();
        car.startEngine();
    }
}
