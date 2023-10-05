package com.marcos.functional_interface.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
    Representa uma função que aceita um argumento do tipo T e retorna um valor.
    É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class ExemploPredicate {

    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("Java", "Javascript", "Python", "C++", "C#", "Golang", "Jest");

        Predicate<String> temMaisDeCincoCaracteres = (palavra) -> palavra.length() > 5;

        List<String> palavrasFiltradas = palavras
                .stream()
                .filter(temMaisDeCincoCaracteres)
                .collect(Collectors.toList());

        palavrasFiltradas.stream().forEach(System.out::println);

        List<String> palavrasQueIniciamComJ = palavras.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("J") || s.startsWith("j");
            }
        }).toList();

        palavrasQueIniciamComJ.stream().forEach(palavra -> System.out.println(palavra));
    }
}
