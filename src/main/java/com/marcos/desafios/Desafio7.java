package com.marcos.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio7 {

    // Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);

        Optional<Integer> resultado = numeros
                .stream()
                .distinct()
                .sorted((n1, n2) -> Integer.compare(n2, n1))
                .skip(1)
                .findFirst();

        resultado.ifPresent(System.out::println);
    }
}
