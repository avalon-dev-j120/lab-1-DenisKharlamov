package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactoryInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Задание №5.
 *
 * <p>Тема: "Изучение отличия между списками и наборами".
 */
public class Task5 implements Task {

    /**
     * Фабрика, генерирующая массивы чисел случайного характера.
     */
    private final RandomArrayFactoryInteger arrayFactory = new RandomArrayFactoryInteger();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        final Integer[] array = arrayFactory.getInstance(20);

        List<Integer> list = new ArrayList<>();

        Set<Integer> set = new TreeSet<>();
        
        list = Arrays.asList(array);
        
        for (int i = 0; i < array.length; i++) {
        	set.add(array[i]);
        }
        Iterator<Integer> setIterator = set.iterator();
        
        System.out.println();
        System.out.println("TASK 5:");
        for (Integer x : list) {
			System.out.print(x + " ");
		}
        System.out.println();
        while(setIterator.hasNext()) {
        	System.out.print(setIterator.next() + " ");
        }

        /**
         * TODO(Студент): Выполните задание №5
         *
         * 1. Проинициализируйте переменные list и set объектами
         *    подходящих классов.
         *
         * 2. В обе коллекции поместите элементы массива array.
         *
         * 3. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
    }
}
