package ExerciciosIntroducaoPOO.Exercicio3;

/**
 * Porta
 */
public class Porta {
    boolean aberta = false;
    String cor;
    int altura;
    int comprimento;
    String estaAberta(Porta porta){
        if (porta.aberta == false)
            return "Fechada";
        return "Aberta";
    }
}