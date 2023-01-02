package ru.jb.eseminar;


//Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
// Метод должен пройтись по каждому элементу и проверить что он не равен null. А теперь реализуйте следующую логику:
//
//Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework {
    public static void main(String[] args) {
        Homework hw = new Homework();
        hw.checkArray(Arrays.asList(1, 2, 3, 4, 5, null, 7, 8, null, 10));
    }

    public void checkArray(List<Integer> array) {
        if (array == null) throw new IllegalStateException("input is Null");
        if (array.isEmpty()) throw new IllegalStateException("array is empty");


        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == null) throw new IllegalStateException(i + " array`s index is equals Null");

        }

    }
}
