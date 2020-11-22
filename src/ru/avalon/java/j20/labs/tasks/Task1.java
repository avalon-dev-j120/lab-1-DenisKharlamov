package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactoryDouble;
import ru.avalon.java.j20.labs.core.RandomArrayFactoryInteger;
import ru.avalon.java.j20.labs.models.Numbers;

/**
 * Задание №1.
 *
 * <p>Тема: "Создание обобщённых методов".
 *
 * <p>В рамках задания требуется описать и выполнить
 * несколько методов, обобщённых с указанной точностью.
 */
public class Task1 implements Task {

    /**
     * Фабрика, создающая массивы случайных чисел.
     */
    private final RandomArrayFactoryInteger integerArrayFactory = new RandomArrayFactoryInteger();
    private final RandomArrayFactoryDouble doubleArrayFactory = new RandomArrayFactoryDouble();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        Integer[] arrayInt = integerArrayFactory.getInstance(3);
        Double[] arrayDouble = doubleArrayFactory.getInstance(3);
        int minI = Numbers.min(arrayInt);
        int maxI = Numbers.max(arrayInt);
        double avgI = Numbers.avg(arrayInt);
        double minD = Numbers.min(arrayDouble);
        double maxD = Numbers.max(arrayDouble);
        double avgD = Numbers.avg(arrayDouble);
        System.out.println("TASK 1 :");
        System.out.println("Min arrayInt: " + minI);
        System.out.println("Max arrayInt: " + maxI);
        System.out.println("Average arrayInt: " + avgI);
        System.out.println("Min arrayDouble: " + minD);
        System.out.println("Max arrayDouble: " + maxD);
        System.out.println("Average arrayDouble: " + avgD + "\n");
        /*
         * TODO(Студент): Выполните задание №1
         *
         * 1. Обобщить метод поиск среднего арифметического
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск среднего арифметического
         *    в массивах любых чисел: целых и вещественных.
         *
         *    Возвращать необходимо значение типа double.
         *
         * 2. Обобщить метод поиск максимального значения
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск максимального значения
         *    в массивах любых чисел: целых и вещественных.
         *
         * 3. Обобщить метод поиск минимального значения
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск минимального значения
         *    в массивах любых чисел: целых и вещественных.
         *
         * 4. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
    }
}
