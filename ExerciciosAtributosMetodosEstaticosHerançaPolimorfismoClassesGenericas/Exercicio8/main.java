package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio8;

public class main {
    public static void main(String[] args) {
        Par par = new Par();
        par.setPar(1, "Segundo");
        System.out.println(par.getPrimeiroPar());
        System.out.println(par.getSegundoPar());
    }
}
