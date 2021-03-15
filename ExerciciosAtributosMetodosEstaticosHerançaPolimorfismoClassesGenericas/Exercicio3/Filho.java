package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio3;

public class Filho extends Pessoa{
    Mae mae = new Mae();
    Pai pai = new Pai();
    
    public Filho(String nome, int idade, String nomeMae, int idadeMae, String nomePai, int idadePai){
        this.nome = nome;
        this.idade = idade;
        mae.nome = nomeMae;
        mae.idade = idadeMae;
        pai.nome = nomePai;
        pai.idade = idadePai;
    }

    public void getArvore(){
        System.out.printf("%s de %d anos é filho de %s com %d anos e %s com %d anos\n", this.nome, this.idade, mae.nome, mae.idade, pai.nome, pai.idade);
    }
}
