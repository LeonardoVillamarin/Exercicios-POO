package ExerciciosTratamentoExcecoes.Exercicio4;

import java.util.*;

public class LeituraFrase {
    public static void main(String[] args) {
        Map<String, Integer> mapPalavras = new HashMap<>();
        String frase = "A frase que a classe vai ler é essa frase que está aqui";
        String[] palavras = frase.split(" ");
        for(String palavra : palavras){
            if(mapPalavras.containsKey(palavra)){
                int i = mapPalavras.get(palavra);
                i++;
                mapPalavras.put(palavra, i);
            }
            else{
                int i = 1;
                mapPalavras.put(palavra.toLowerCase(), i);
            }
        }
        for(String key : mapPalavras.keySet()){
            System.out.println(key + ": " + mapPalavras.get(key) + " vezes");
        }
    }
}