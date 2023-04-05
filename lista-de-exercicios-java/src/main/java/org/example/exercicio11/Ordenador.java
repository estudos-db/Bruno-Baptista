package org.example.exercicio11;

import java.util.Arrays;

public class Ordenador {
    private int[] array;

    public Ordenador(int[] array) {
        this.array = array;
    }

    public int[] ordenar() {
        int[] array = this.array;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public String getString() {
        return Arrays.toString(array);
    }
}
