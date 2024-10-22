package ru.oop.task2;

/**
 * Один из видов транспорта
 */

public class Bus implements Transport {

    String number;
    Person person;

    public Bus(String number, Person person) {
    }

    @Override
    public void movePersonToDestination(Person person, Position destination) {
    }

    @Override
    public Position getPosition() {
        return null;
    }
}
