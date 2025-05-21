package main.ejercicio2;

import java.util.HashSet;

public class RespuestasOptimizadas {
    // 1. Versión optimizada de tieneDuplicados (Complejidad anotada)
    public static String tieneDuplicadosComplejidad = "O(n)";

    public static boolean tieneDuplicadosOpt(int[] arr) {
        HashSet<Integer> elementos = new HashSet<>();
        for (int num : arr) {
            if (elementos.contains(num)) {
                return true;
            }
            elementos.add(num);
        }
        return false;
    }

    // 2. Versión optimizada de contarMayores (Complejidad anotada)
    public static String contarMayoresComplejidad = "O(n)";

    public static int contarMayoresOpt(int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (num > x) {
                count++;
            }
        }
        return count;
    }

    // 3. Versión optimizada de encontrarMaximo (Complejidad anotada)
    public static String encontrarMaximoComplejidad = "O(n)";

    public static int encontrarMaximoOpt(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}