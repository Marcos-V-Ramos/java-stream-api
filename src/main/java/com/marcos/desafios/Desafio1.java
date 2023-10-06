package com.marcos.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio1 {

    // Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosOrdenados = numeros
                                        .stream()
                                        .sorted((n1, n2) -> Integer.compare(n1, n2))
                                        .collect(Collectors.toList());

        numerosOrdenados
                .stream()
                .forEach(numero -> System.out.println(numero));
    }
}
