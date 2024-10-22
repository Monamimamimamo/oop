package ru.oop.task3;


/**
 * общий класс для любого вида транспорта
 */
public interface Transport extends Positioned {

    /**
     * Довозит человека максимально близко до места назначения <br>
     * Изменяет текущий position человека
     */
    void movePersonToDestination(Person person, Position destination);
}
