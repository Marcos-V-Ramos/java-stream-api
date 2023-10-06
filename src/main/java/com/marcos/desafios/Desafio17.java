package com.marcos.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio17 {

    // Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros
                                        .stream()
                                        .filter(Desafio17::ehPrimo)
                                        .toList();

        numerosPrimos.forEach(System.out::println);
    }

    public static boolean ehPrimo(Integer numero) {
        if (numero <= 1) {
            return false;
        }

        int divisor = 0;

        for(int i = numero; i > 0; i--) {
            if (numero % i == 0) {
                divisor++;
            }
        }

        return divisor == 2;
    }
}
