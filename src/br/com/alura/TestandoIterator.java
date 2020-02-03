package br.com.alura;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestandoIterator {
    public static void main(String[] args) {
        List<String> letras = new LinkedList<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");
        letras.add("D");

        letras.forEach(letra -> {
            System.out.println(letra);
        });

        System.out.println("***********");

        Iterator<String> iterador = letras.iterator();
        while (iterador.hasNext()){
            String proxima = iterador.next();
            System.out.println(proxima);
        }
    }
}
