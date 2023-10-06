package com.marcos.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio4 {

    // Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPositivos = numeros
                                        .stream()
                                        .filter(item -> item % 2 == 0)
                                        .collect(Collectors.toList());

        numerosPositivos.stream().forEach(System.out::println);
    }
}
