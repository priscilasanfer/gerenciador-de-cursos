package br.com.alura;

public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando colecoes do java", "Paulo");

        javaColecoes.adiciona(new Aula("Primeira aula", 10));
        javaColecoes.adiciona(new Aula("Segunda aula", 11));
        javaColecoes.adiciona(new Aula("Terceira aula", 12));
        javaColecoes.adiciona(new Aula("Qua rta aula", 13));

        Aluno a1 = new Aluno("Pri", 1234);
        Aluno a2 = new Aluno("Meg", 1235);
        Aluno a3 = new Aluno("Malu", 1236);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Quem é o aluno com matricula 10? ");
        Aluno aluno = javaColecoes.buscaMatriculado(124);
        System.out.println("Aluno: " + aluno);
    }
}
