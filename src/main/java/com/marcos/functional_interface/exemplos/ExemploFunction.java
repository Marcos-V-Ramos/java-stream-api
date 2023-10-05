package com.marcos.functional_interface.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/*
    Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
    É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.
 */
public class ExemploFunction {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usa a Function para dobrar todos os números e transformar em Double:
        // Function<Tipo, Retorno>
        Function<Integer, Double> dobrarTransformarDouble = numero -> (double)numero * 2;

        // O resultado é armazenado em um List<Double>:
        List<Double> numerosTransformados = numeros
                                            .stream()
                                            .map(dobrarTransformarDouble)
                                            .toList();

        numerosTransformados
                .stream()
                .forEach((numero) -> System.out.println(numero));

        // Classe anônima:
        List<Double> numerosNegativos = numerosTransformados.stream().map(new Function<Double, Double>() {
            @Override
            public Double apply(Double numero) {
                return numero * -1;
            }
        }).collect(Collectors.toList());

        numerosNegativos.stream().forEach(System.out::println);

    }
}
