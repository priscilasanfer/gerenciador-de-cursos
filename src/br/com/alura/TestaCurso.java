package br.com.alura;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com Arrays", 21));
        javaColecoes.adiciona(new Aula("Listas de objetos", 20));
        javaColecoes.adiciona(new Aula("Relacionamento de listas", 15));

        System.out.println(javaColecoes.getAulas());


    }
}
