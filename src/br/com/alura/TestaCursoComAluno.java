package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Curso Nome", "Priscila");

        javaColecoes.adiciona(new Aula("Primeira aula", 10));
        javaColecoes.adiciona(new Aula("Segunda aula", 11));
        javaColecoes.adiciona(new Aula("Terceira aula", 12));
        javaColecoes.adiciona(new Aula("Quarta aula", 13));

        Aluno a1 = new Aluno("Pri", 1234);
        Aluno a2 = new Aluno("Meg", 1235);
        Aluno a3 = new Aluno("Malu", 1236);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        Aluno a4 = new Aluno("Juliana", 45345);

//        javaColecoes.getAlunos().add(a4); ==> Nao funciona por causa do Collections.unmodifiableSet(alunos)

        System.out.println("Todos os alunos matriculaods " );

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        while (iterador.hasNext()) {
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }

//        buscar os alunos de outra forma
        for (Aluno a : javaColecoes.getAlunos()) {
            System.out.println(a);
        }

        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });

        System.out.println("O aluno " + a1 + " esta matriculado? ");
        System.out.println(javaColecoes.estaMatriculado(a1));

        System.out.println();
        Aluno pri = new Aluno("Pri", 1234);
        System.out.println("E esse pri esta matriculado?");
        System.out.println(javaColecoes.estaMatriculado(pri));

        System.out.println();
        System.out.println("O aluno a1 é equals a Pri ");
        System.out.println(a1.equals(pri));

        //Obrigatoriamente o seguinte é true:
        System.out.println(a1.hashCode() == pri.hashCode());


    }
}

