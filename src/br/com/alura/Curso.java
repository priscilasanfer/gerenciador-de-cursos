package br.com.alura;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public int getTempoTotal(){
//        int tempoTotal = 0;
//        for (Aula aula: aulas) {
//            tempoTotal += aula.getTempo();
//        }
//        return tempoTotal;

        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + " minutos, " +
                "aulas: " + this.aulas + "]";
    }



    public int getTotalTempo2(){
//        int tempo = 0;
//        for (Aula aula: aulas) {
//            tempo += aula.getTempo();
//        }
//        return tempo;

        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

















}
