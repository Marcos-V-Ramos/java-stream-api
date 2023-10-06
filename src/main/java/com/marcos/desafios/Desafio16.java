package com.marcos.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio16 {

    // Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os
    // números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numeroPares = numeros
                                    .stream()
                                    .filter(numero -> numero % 2 == 0)
                                    .toList();

        List<Integer> numerosImpares = numeros
                                        .stream()
                                        .filter(numero -> numero % 2 != 0)
                                        .toList();

        System.out.print("Pares: ");
        numeroPares.forEach(numero -> System.out.print(numero + " "));

        System.out.print("\nÍmpares: ");

        numerosImpares.forEach(numero -> System.out.print(numero + " "));
    }
}
