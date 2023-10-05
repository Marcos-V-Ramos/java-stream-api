package com.marcos.functional_interface.exemplos;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/*
    Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
    É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */
public class ExemploBinaryOperator {


    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2; // Method Reference Integer::sum

        int resultado = numeros.stream().reduce(0, somar);

        System.out.println("Soma: " + resultado);


        // classe anônima

        List<String> palavras = Arrays.asList("Marcos", "Vinicius", "Isabelle", "Eu");

        String concatenacao = palavras.stream().reduce("Concat: ", new BinaryOperator<String>() {
            @Override
            public String apply(String s, String s2) {
                return s + " " + s2;
            }
        });

        System.out.println("Resultado da concatenação:" + concatenacao);
    }
}
