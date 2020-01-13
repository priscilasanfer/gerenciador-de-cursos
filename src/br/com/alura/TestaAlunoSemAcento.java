package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunoSemAcento {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();

        alunos.add("Regina");
        alunos.add("Celso");
        alunos.add("Erica");
        alunos.add("Patricia");
        alunos.add("Vinicius");
        alunos.add("Miguel");
        alunos.add("Gustavo");

        System.out.println(alunos.size());
        alunos.add("Gustavo");


        boolean adicionou = alunos.add("Gustavo");
        System.out.println("Pedro foi Gustavo ao Set? " + adicionou);



    }
}
