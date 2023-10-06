package com.marcos.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Desafio8 {

    // Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<String> numerosString = numeros
                .stream()
                .map(String::valueOf)
                .toList();

        Stream<String> res = numerosString
                                .stream()
                                .flatMap(caractere -> Arrays.stream(caractere.split("")));

        long soma = res
                    .map(Integer::parseInt)
                    .reduce(0, Integer::sum)
                    .longValue();

        System.out.println(soma);
    }
}
