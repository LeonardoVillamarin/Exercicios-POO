package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio6;

import java.util.ArrayList;

public class Pokemon {
    private String nome;
    private String aparencia;
    private int peso;
    private int tamanho;

    private ArrayList<Ataque> ataques = new ArrayList<Ataque>();
    private ArrayList<Habilidade> habilidades = new ArrayList<Habilidade>();

    public Pokemon(String nome, String aparencia, int peso, int tamanho){
        this.nome = nome;
        this.aparencia = aparencia;
        this.peso = peso;
        this.tamanho = tamanho;
    }
    public String getNome(){
        return nome;
    }
    public void getPokemon(){
        
    }
    public void getInfo(){
        System.out.printf("Nome: %s - Aparencia: %s - Peso: %s - Tamanho: %s - ", this.nome, this.aparencia, this.peso, this.tamanho);
    }
    public void setStats(String nome, String aparencia, int peso, int tamanho){
        this.nome = nome;
        this.aparencia = aparencia;
        this.peso = peso;
        this.tamanho = tamanho;
    }
    public void setAtaque(String nome, int precisao, int potencia, int qtdMaxUso, String tipoAtaque){
        ataques.add(new Ataque(nome, precisao, potencia, qtdMaxUso, tipoAtaque));
    }

    public void setHabilidade(String nome, String tipoHab){
        habilidades.add(new Habilidade(nome, tipoHab));
    }

    public void Evolui(String nome, String aparencia, int peso, int tamanho, int hp, int atk, int def, int spAtk, int spDef, int spd){

    }
}
