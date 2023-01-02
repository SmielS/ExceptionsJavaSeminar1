package ru.jb.eseminar;

// реализуйте метод, принимащий в качестве аргументов два целочисленных массива и возвращающий новый массив,
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке
// Если длины массивов не равны, то необходимо как-то оповестить пользователя

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task0 {
    public static void main(String[] args) {
        Task0 task0 = new Task0();
        System.out.println(task0.getResult(Arrays.asList(5,4,3,2,1), Arrays.asList(4,3,2,1)));
    }

    List<Integer> getResult(List<Integer> list1, List<Integer> list2){
        if (list1 == null || list2 == null){
            throw new MyException("one of arrays is Null");
        }
        if (list1.isEmpty() || list2.isEmpty()){
            throw new IllegalStateException("one of arrays is empty");
        }
        if (list1.size() != list2.size()){
            throw new IllegalStateException("lengths of arrays is not equals");
        }
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            resultList.add(list1.get(i) - list2.get(i));
        }

        return resultList;
    }
}