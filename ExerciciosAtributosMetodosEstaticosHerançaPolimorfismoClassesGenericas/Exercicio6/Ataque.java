package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio6;

public class Ataque {
    private String nome;
    private int precisao;
    private int potencia;
    private int qtdMaxUso;
    private String tipoAtaque;

    public Ataque(String nome, int precisao, int potencia, int qtdMaxUso, String tipoAtaque){
        this.precisao = precisao;
        this.potencia = potencia;
        this.qtdMaxUso = qtdMaxUso;
        this.tipoAtaque = tipoAtaque;
    }
}
