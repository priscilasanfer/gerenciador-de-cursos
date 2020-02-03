package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAluno {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Priscila Ferreira");
        alunos.add("Meg Feereira");
        alunos.add("Malu Ferreira");
        alunos.add("Priscila Ferreira");

        System.out.println(alunos.size() );

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        } );

        for (String aluno: alunos) {
            System.out.println(aluno);
        }

        boolean pauloEstaMatriculado = alunos.contains("Paulo");

        System.out.println("Paulo esta matriculado: " + pauloEstaMatriculado);

        alunos.remove("Priscila Ferreira");

//        Caso precise saber o indice da lista
        List<String> alunosEmLista = new ArrayList<>(alunos);


    }
}
