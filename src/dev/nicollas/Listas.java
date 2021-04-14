package dev.nicollas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
        // Listas em Java
        List<Integer> lista = new ArrayList<>();

        // Adicionando Elementos
        lista.add(8);
        lista.add(32);
        lista.add(10);
        lista.add(10);
        lista.add(4);
        lista.add(25);

        // Removendo Elementos
        lista.remove(3);

        // Adicionando listas
        lista.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        // Percorrendo Listas
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for (Integer integer : lista) {
            System.out.println(integer);
        }

        lista.forEach(System.out::println);
        lista.forEach(item -> System.out.println(Math.pow(item, 2)));

        // Stream
        // Lista somente com numeros pares
        List<Integer> listaPares =  lista.stream().filter(item -> item % 2 == 0).collect(Collectors.toList());
        listaPares.forEach(System.out::println);


        // Verificando com Contains
        System.out.println("Tem 5? " + lista.contains(5));
    }
}
