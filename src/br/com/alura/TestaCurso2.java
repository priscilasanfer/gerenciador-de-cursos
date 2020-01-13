package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Curso Nome", "Priscila");

        javaColecoes.adiciona(new Aula("Primeira aula", 10));
        javaColecoes.adiciona(new Aula("Segunda aula", 11));
        javaColecoes.adiciona(new Aula("Terceira aula", 12));
        javaColecoes.adiciona(new Aula("Quarta aula", 13));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);

    }

}
