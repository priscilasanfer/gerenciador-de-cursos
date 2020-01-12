package br.com.alura;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
//        Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");
//
//        javaColecoes.adiciona(new Aula("Trabalhando com Arrays", 21));
//        javaColecoes.adiciona(new Aula("Listas de objetos", 20));
//        javaColecoes.adiciona(new Aula("Relacionamento de listas", 15));
//
//        System.out.println(javaColecoes.getAulas());


        Curso desenho = new Curso("Primeiros passos", "Priscila Ferreira");

        List<Aula> aulas = desenho.getAulas();

        System.out.println(aulas);

        desenho.adiciona(new Aula("Historia da arte", 10));
        desenho.adiciona(new Aula("Primeiros tracos", 15));
        desenho.getAulas().add(new Aula("Teste", 10));

        System.out.println(aulas);


    }
}
