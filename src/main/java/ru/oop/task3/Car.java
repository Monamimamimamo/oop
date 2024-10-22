package ru.oop.task3;
/**
 * Один из видов транспорта <br>
 * Немного быстрее автобуса
 */
public class Car implements Transport {

    Person person;

    /**
     * Один из видов транспорта <br>
     * Немного быстрее автобуса
     */
    public Car(Person person) {
    }

    @Override
    public void movePersonToDestination(Person person, Position destination) {
    }

    @Override
    public Position getPosition() {
        return null;
    }
}
