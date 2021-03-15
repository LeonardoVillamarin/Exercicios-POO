package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio6;

import java.util.ArrayList;

public class Treinador {
    private String nome;
    private ArrayList<Pokemon> mochila = new ArrayList<Pokemon>();
    
    public Treinador(String nome){
        this.nome = nome;
    }

    public void capturaPokemon(String nome, String aparencia, int peso, int tamanho, String nomeAtk, int precisao, int potencia, int qtdMaxUso, String tipoAtaque, String nomeHab, String tipoHab, String tipoPokemon){
        if(tipoPokemon == "Fogo"){
            mochila.add(new Fogo(nome, aparencia, peso, tamanho));
            Pokemon pokemon = mochila.get(mochila.size()-1);
            pokemon.setAtaque(nomeAtk, precisao, potencia, qtdMaxUso, tipoAtaque);
            pokemon.setHabilidade(nomeHab, tipoHab);
        }
        else if(tipoPokemon == "Água"){
            mochila.add(new Agua(nome, aparencia, peso, tamanho));
            Pokemon pokemon = mochila.get(mochila.size()-1);
            pokemon.setAtaque(nomeAtk, precisao, potencia, qtdMaxUso, tipoAtaque);
            pokemon.setHabilidade(nomeHab, tipoHab);
        }
        else if(tipoPokemon == "Elétrico"){
            mochila.add(new Eletrico(nome, aparencia, peso, tamanho));
            Pokemon pokemon = mochila.get(mochila.size()-1);
            pokemon.setAtaque(nomeAtk, precisao, potencia, qtdMaxUso, tipoAtaque);
            pokemon.setHabilidade(nomeHab, tipoHab);
        }
    }
    public void getPokemon(String nome){
        int aux = 0;
        for(Pokemon pokemon:mochila){
            if(pokemon.getNome() == nome){
                pokemon.getPokemon();
            }
            else{
                aux++;
            }
        }
        if(aux == mochila.size()){
            System.out.println("Esse Pokémon não está na sua mochila!!");
        }
    }
}
