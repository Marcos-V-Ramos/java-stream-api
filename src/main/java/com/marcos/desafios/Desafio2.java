package com.marcos.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {

    // Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer somaPares = numeros
                            .stream()
                            .filter(numero -> numero % 2 == 0)
                            .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println("Soma dos pares: " + somaPares);
    }
}
