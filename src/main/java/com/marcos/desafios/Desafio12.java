package com.marcos.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {

    // Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Long produtoDosNumeros = 0L;

        produtoDosNumeros = numeros
                            .stream()
                            .reduce(1, (n1, n2) -> n1 * n2).longValue();

        System.out.println("Resultado: " + produtoDosNumeros);
    }
}
