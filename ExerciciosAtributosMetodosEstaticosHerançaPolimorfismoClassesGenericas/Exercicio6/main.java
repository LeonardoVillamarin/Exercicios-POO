package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio6;

public class main {
    public static void main(String[] args) {
        Treinador treinador = new Treinador("Leo");
        Treinador treinador2 = new Treinador("João");
        treinador.capturaPokemon("Charmander", "Dragão", 20, 60, "Bola de fogo", 40, 75, 6, "Queimar", "Ardência", "Dano de fogo", "Fogo");
        treinador.capturaPokemon("Pikachu", "Rato Amarelo", 15, 45, "Choque do Trovão", 75, 50, 7, "Choque", "Descarga Elétrica", "Dano elétrico", "Elétrico");
        treinador2.capturaPokemon("Squirtle", "Tartaruga Azul", 30, 40, "Jato d'água", 60, 60, 10, "Confundir", "Casco Rígido", "Fortalece Stats", "Água");
        System.out.println("====================================================================================================================================================================================");
        treinador.getPokemon("Charmander");
        System.out.println("====================================================================================================================================================================================");
        treinador.getPokemon("Pikachu");
        System.out.println("====================================================================================================================================================================================");
        treinador2.getPokemon("Squirtle");
        System.out.println("====================================================================================================================================================================================");
    }
}
