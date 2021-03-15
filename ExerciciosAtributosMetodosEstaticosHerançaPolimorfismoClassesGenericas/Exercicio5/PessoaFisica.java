package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio5;

public class PessoaFisica extends Pessoa{
    private String nome;
    private String CPF;
    private String dataAniversario;

    public PessoaFisica(String nome, String CPF, String endereco,String dataAniversario){
        super(endereco);
        this.nome = nome;
        this.CPF = CPF;
        this.dataAniversario = dataAniversario; 
    }
    @Override
    public String getDocumento(){
        return CPF;
    }
    @Override
    public void getContato(){
        System.out.printf("Nome: %s - CPF: %s - Endereço: %s - Data de Aniversário: %s\n", this.nome, this.CPF, this.getEndereco(), this.dataAniversario);
    }
}
