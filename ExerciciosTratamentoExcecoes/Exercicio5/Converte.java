package ExerciciosTratamentoExcecoes.Exercicio5;

import java.util.*;

public class Converte {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("Convertendo");
        arraylist.add("a");
        arraylist.add("interface");
        arraylist.add("X");
        arraylist.add("para");
        arraylist.add("interface");
        arraylist.add("y");
        System.out.println(arraylist.toString());

        HashSet<String> hashSet = new HashSet<>(arraylist);
        System.out.println(hashSet.toString());

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(hashSet);
        System.out.println(priorityQueue.toString());

        ArrayDeque<String> arrayDeque = new ArrayDeque<>(priorityQueue);
        System.out.println(arrayDeque.toString());

        TreeSet<String> treeSet = new TreeSet<>(arrayDeque);
        System.out.println(treeSet);
        
        //Porque alguns como o HashSet tem como prioridade o tempo de execução e não se importam com ordenação
    }
}
