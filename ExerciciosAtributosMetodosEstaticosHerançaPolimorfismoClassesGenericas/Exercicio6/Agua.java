package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio6;

public class Agua extends Pokemon{
    private int hp = 220;
    private int atk = 35;
    private int def = 100;
    private int spAtk = 190;
    private int spDef = 210;
    private int spd = 46;

    public Agua(String nome, String aparencia, int peso, int tamanho){
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
