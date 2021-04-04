package ExerciciosClassesAbstratasInterfacesArquivos.Exercicio4;

public class MainFolhaPagamento {
    public static void main(String[] args) {
        //ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        Funcionario Joao = new Assalariado("João", "111.222.333-12", 1500);
        Funcionario Joana = new PorHora("Joana", "121.212.323-34", 1200, 150);
        Funcionario Marcos = new Comissionado("Marcos", "131.313.424-56", 5.3f);
        Funcionario Maria = new ComissionadoAssalariado("Maria", "141.414.525-78", 1400, 3);
        Joao.getFolhaPagamento();
        Joana.getFolhaPagamento(10);
        Marcos.getFolhaPagamento(25000);
        Maria.getFolhaPagamento(40000);
    }
}
