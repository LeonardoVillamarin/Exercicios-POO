package ExerciciosAtributosMetodosEstaticosHerançaPolimorfismoClassesGenericas.Exercicio5;

public class PessoaJuridica extends Pessoa{
    private String razaoSocial;
    private String CNPJ;
    private int faturamento;

    public PessoaJuridica(String razaoSocial, String CNPJ, String endereco, int faturamento){
        super(endereco);
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.faturamento = faturamento;
    }
    @Override
    public String getDocumento(){
        return CNPJ;
    }
    @Override
    public void getContato(){
        System.out.printf("Razão Social: %s - CNPJ: %s - Endereço: %s - Faturamento: %d\n", this.razaoSocial, this.CNPJ, this.getEndereco(), this.faturamento);
    }
}
