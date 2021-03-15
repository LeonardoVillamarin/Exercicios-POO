package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio6;

public class Fogo extends Pokemon {
    private int hp = 180;
    private int atk = 90;
    private int def = 40;
    private int spAtk = 220;
    private int spDef = 150;
    private int spd = 32;

    public Fogo(String nome, String aparencia, int peso, int tamanho){
        super(nome, aparencia, peso, tamanho);
    }
    @Override
    public void getPokemon(){
        this.getInfo();
        System.out.printf("HP: %d - Ataque: %d - Defesa: %d - Ataque Especial: %d - Defesa Especial: %d - Velocidade: %d\n", this.hp, this.atk, this.def, this.spAtk, this.spDef, this.spd);
    }
    @Override
    public void Evolui(String nome, String aparencia, int peso, int tamanho, int hp, int atk, int def, int spAtk, int spDef, int spd){
        this.setStats(nome, aparencia, peso, tamanho);
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.spd = spd;
    }
}
