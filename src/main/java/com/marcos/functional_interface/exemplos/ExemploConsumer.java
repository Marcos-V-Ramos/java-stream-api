package com.marcos.functional_interface.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
    Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
    É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou retornar um valor.
 */
public class ExemploConsumer {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Consumer com Expressão Lambda:
        Consumer<Integer> imprimirNumerosPares = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        //o forEach() recebe um Consumer
        numeros.stream().forEach(imprimirNumerosPares);

        // numeros ímpares:
        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer num) {
                if (num % 2 != 0) {
                    System.out.println(num);
                }
            }
        });

        // simplificado:
        numeros.forEach(numero -> {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
        });

        // Filter + Consumer:

        numeros
                .stream()
                .filter(numero -> numero % 2 == 0)
                .forEach(numero -> System.out.println(numero));
    }
}
