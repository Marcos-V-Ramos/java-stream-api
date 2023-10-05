package com.marcos.functional_interface.exemplos;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*
    Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
    É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class ExemploSupplier {

    public static void main(String[] args) {

        Supplier<String> saudacao = () -> "Olá, seja bem-vindo!";

        // Usar o Supllier para obter uma lista com 5 saudações:
        List<String> listaSaudacoes = Stream.generate(saudacao)
                                            .limit(6)
                                            .toList();

        List<String> listaSaudacoesDois = Stream.generate(new Supplier<String>() {
            @Override
            public String get() {
                return "Utilizando uma função anônima";
            }
        }).limit(10).toList();

        // Imprimir as saudações:
        listaSaudacoes.forEach(System.out::println); //Method reference
        listaSaudacoesDois.forEach(item -> System.out.println(item));
    }
}
