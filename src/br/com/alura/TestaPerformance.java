package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
    public static void main(String[] args) {
        System.out.println("Arraylista");
        Collection<Integer> numerosArrayList = new ArrayList<>();
        long inicioInsercaoArrayList = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            numerosArrayList.add(i);
        }
        long fimInsercaoArrayList = System.currentTimeMillis();
        long tempoDeExecucaoInsercaoArrayList = fimInsercaoArrayList - inicioInsercaoArrayList;
        System.out.println("Tempo gasto na inserção: " + tempoDeExecucaoInsercaoArrayList);


        long inicioBuscaArrayList = System.currentTimeMillis();
        for (Integer numero: numerosArrayList) {
            numerosArrayList.contains(numero);
        }

        long fimBuscaArrayList = System.currentTimeMillis();

        long tempoDeExecucaoBuscaArrayList = fimBuscaArrayList - inicioBuscaArrayList;

        System.out.println("Tempo gasto na busca: " + tempoDeExecucaoBuscaArrayList);

        System.out.println();
        System.out.println();

        System.out.println("Set");
        Collection<Integer> numerosSet = new HashSet<>();
        long inicioInsercaoSet = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            numerosSet.add(i);
        }
        long fimInsercaoSet = System.currentTimeMillis();
        long tempoDeExecucaoInsercaoSet = fimInsercaoSet - inicioInsercaoSet;
        System.out.println("Tempo gasto na inserção: " + tempoDeExecucaoInsercaoSet);


        long inicioBuscaSet = System.currentTimeMillis();
        for (Integer numero: numerosSet) {
            numerosSet.contains(numero);
        }

        long fimBuscaSet = System.currentTimeMillis();

        long tempoDeExecucaoBuscaSet = fimBuscaSet - inicioBuscaSet;

        System.out.println("Tempo gasto na busca: " + tempoDeExecucaoBuscaSet);

    }
}
