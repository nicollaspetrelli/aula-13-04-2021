package dev.nicollas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaObjetos {
    public static void main(String[] args) {

        Aluno a1 = new Aluno(1020304060, "Nicollas");
        Aluno a2 = new Aluno(1032104060, "Julianao");
        Aluno a3 = new Aluno(1054104060, "Julianinha");

        // Lista de Objetos
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(a1);
        alunos.addAll(Arrays.asList(a2, a3));

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

    }
}
