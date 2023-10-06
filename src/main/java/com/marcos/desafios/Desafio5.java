package com.marcos.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio5 {

    // Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaNumerosMaioresQueCinco = numeros
                .stream()
                .filter(numero -> numero > 5).toList().stream()
                .reduce(0, (n1, n2) -> (n1 + n2));

        long quantidadenumerosMaioresQueCinco = numeros
                .stream()
                .filter(numero -> numero > 5)
                .count();

        System.out.println("Soma: " + somaNumerosMaioresQueCinco);
        System.out.println("Quantidade: " + quantidadenumerosMaioresQueCinco);
        System.out.println("Média: " + somaNumerosMaioresQueCinco / quantidadenumerosMaioresQueCinco);
    }
}
