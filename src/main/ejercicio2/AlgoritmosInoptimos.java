package main.ejercicio2;

import java.util.HashSet;

public class AlgoritmosInoptimos {

    // 1. Buscar duplicados en un arreglo con HashSet (O(n))
    public static boolean tieneDuplicados(int[] arr) {
        HashSet<Integer> elementos = new HashSet<>();
        for (int num : arr) {
            if (elementos.contains(num)) {
                return true;
            }
            elementos.add(num);
        }
        return false;
    }

    // 2. Contar elementos mayores que X (simplificado a una sola pasada)
    public static int contarMayores(int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (num > x) {
                count++;
            }
        }
        return count;
    }

    // 3. Encontrar el valor máximo en una sola pasada (O(n))
    public static int encontrarMaximo(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}