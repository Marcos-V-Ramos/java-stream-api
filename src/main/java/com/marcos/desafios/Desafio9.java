package com.marcos.desafios;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Desafio9 {

    // Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean resultado = numeros.stream().distinct().count() == numeros.stream().count();

        System.out.println("Todos os números são distintos: " + resultado);
    }
}
