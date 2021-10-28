package com.company;

import java.util.ArrayList;

public class InsertionSort {
    public void insertion_sort(Comparable[] list){
        for (int left = 0; left < list.length; left++) {
            // Вытаскиваем значение элемента
            Comparable value = list[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value.compareTo(list[i])<0) {
                    list[i + 1] = list[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            list[i + 1] = (Comparable) value;
        }
    }
}
