package com.marcos.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Desafio18 {

    // Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean resultado = numeros
                            .stream()
                            .allMatch(numero -> Objects.equals(numero, numeros.get(0)));

        System.out.println("Todos os números da lista são iguais? " + resultado);
    }
}
