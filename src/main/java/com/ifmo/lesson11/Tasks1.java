package com.ifmo.lesson11;

import com.ifmo.lesson11.inner.Message;
import com.ifmo.lesson11.inner.MessageGenerator;
import com.ifmo.lesson11.inner.MessagePriority;

import java.util.*;

/*
    Реализуйте все методы.
 */
public class Tasks1 {

    public static void main(String[] args) {
        MessageGenerator generator = new MessageGenerator();

        List<Message> messages = generator.generate(100);

        countEachPriority(messages);
        countCountEachCode(messages);
        countUniqueMessages(messages);

        System.out.println("Genuine messages in natural order: \n" + genuineMessagesInOriginalOrder(messages));

        removeEach(generator.generate(100), MessagePriority.LOW);
        removeOther(generator.generate(100), MessagePriority.URGENT);
    }

    private static void countEachPriority(List<Message> messages) {
        // Сосчитайте количество сообщений для каждого приоритета.
        // Ответ необходимо вывести в консоль.
// сщздаем переменные для счетчиков
        int lowCount = 0;
        int mediumCount = 0;
        int highCount = 0;
        int urgentCount = 0;
        // создаем цикл for each
        for (Message element : messages) {
            //создаем swich чтобы сравнивать поле каждого элемента с определенными значениями
            // и при совпадении значении мы увеличиваем счетчики на единицу
            switch (element.getPriority()) {

                case LOW:
                    lowCount++;
                    break;
                case HIGH:
                    highCount++;
                    break;
                case MEDIUM:
                    mediumCount++;
                    break;
                case URGENT:
                    urgentCount++;
                    break;
            }
        }
        //вывести в консоль, напечатать на экране
        System.out.println("Количество сообщений для приоритета " + MessagePriority.LOW + ": " + lowCount);
        System.out.println("Количество сообщений для приоритета " + MessagePriority.HIGH + ": " + highCount);
        System.out.println("Количество сообщений для приоритета " + MessagePriority.MEDIUM + ": " + mediumCount);
        System.out.println("Количество сообщений для приоритета " + MessagePriority.URGENT + ": " + urgentCount);
    }

    private static void countCountEachCode(List<Message> messages) {
        // Сосчитайте количество сообщений для каждого кода сообщения.
        // Ответ необходимо вывести в консоль.
        //создаем map
        Map<Integer, Integer> states = new HashMap<Integer, Integer>();
//итерируемся по LIST который передам в метод по параметрам
        for (Message element : messages) {
            int tempCode = element.getCode();
            // проверяем содержит ли map в качестве ключа код текущего элемента
            if (states.containsKey(tempCode)) {
                states.put(tempCode, states.get(tempCode) + 1);
            } else {
                states.put(tempCode, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : states.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
        //пишем for each чтоб итерироваться- перебирать по коллекции


    }

    private static void countUniqueMessages(List<Message> messages) {
        // Сосчитайте количество уникальных сообщений.
        // Ответ необходимо вывести в консоль.

        Map<Integer, Integer> states = new HashMap<Integer, Integer>();
//итерируемся по LIST который передам в метод по параметрам
        for (Message element : messages) {
            int tempCode = element.getCode();
            states.put(tempCode, 1);
        }
        System.out.println(states.size());
    }

    private static List<Message> genuineMessagesInOriginalOrder(List<Message> messages) {
        // Здесь необходимо вернуть только неповторяющиеся сообщения и в том порядке, в котором
        // они встречаются в первоначальном списке. Например, мы на входе имеем такие сообщения:
        // [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}],
        // то на выходе должны получить:
        // [{URGENT, 4}, {HIGH, 9}, {LOW, 3}].
        // Т.е. остались только уникальные значения, и порядок их поступления сохранен.
        //объявить коллекцию set

        return messages;
    }

    private static void removeEach(Collection<Message> messages, MessagePriority priority) {
        // Удалить из коллекции каждое сообщение с заданным приоритетом.
        System.out.printf("Before remove each: %s, %s\n", priority, messages);
//создаем объект типа интерфейса Iterator далее перебираем и сравниваем и удаляем
        Iterator<Message> iter = messages.iterator();
        while (iter.hasNext()) {
            if (iter.next().getPriority().equals(priority)) {
                iter.remove();
            }
        }
        System.out.printf("After remove each: %s, %s\n", priority, messages);

    }

    private static void removeOther(Collection<Message> messages, MessagePriority priority) {
        // Удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет.
        System.out.printf("Before remove other: %s, %s\n", priority, messages);

        Iterator<Message> iter = messages.iterator();
        while (iter.hasNext()) {
            if (!iter.next().getPriority().equals(priority)) {
                iter.remove();
            }
        }

        System.out.printf("After remove other: %s, %s\n", priority, messages);
    }
}
