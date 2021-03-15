package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio3;

public class main {
    public static void main(String[] args) {
        Filho filho = new Filho("Gabriel", 17, "Maria", 45, "João", 47);
        Filho filho2 = new Filho("Bruno", 20, "Bruna", 50, "Lucas", 51);
        filho.getArvore();
        filho2.getArvore();
    }
}
