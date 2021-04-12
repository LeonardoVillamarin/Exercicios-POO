package ExerciciosTratamentoExcecoes.Exercicio3;


public abstract class CadastraCliente {
    static Cliente[] clientes = new Cliente[10];
    static int clientesCadastrados = 0;

    public static void setClientes(Cliente cliente){
        boolean cadastrado = false;
        for(int i = 0; i < clientesCadastrados; i++){
            if(clientes[i].getCPF().equals(cliente.getCPF())){
                cadastrado = true;
            }
        }
        if(cadastrado == false){
            if(clientesCadastrados < 10){
                clientes[clientesCadastrados] = cliente;
                clientesCadastrados++;
            }
            else{
                throw new RepositorioException();
            }
        }
        else{
            throw new ClienteJaExistenteException();
        }
    }
    public static void getCliente(String CPF){
        Cliente cliente = null;
        for(int i = 0; i < clientesCadastrados; i++){
            if(clientes[i].getCPF().equals(CPF)){
                cliente = clientes[i];
            }
        }
        if(cliente == null){
            throw new ClienteInexistenteException();
        }
        System.out.println("Cliente encontrado");
    }
    public static void main(String[] args) {
        try{
            CadastraCliente.setClientes(new Cliente(null, "321331223", "2312313442", "pedro@gmail.com"));    
        }catch(DadoInvalidoException e){
            System.out.println(e.getMessage());
        }catch(ClienteJaExistenteException e){
            System.out.println(e.getMessage());
        }catch(RepositorioException e){
            System.out.println(e.getMessage());
        }
        try{
            CadastraCliente.setClientes(new Cliente("Pedro", "321331223", "2312313442", "pedro@gmail.com"));    
        }catch(DadoInvalidoException e){
            System.out.println(e.getMessage());
        }catch(ClienteJaExistenteException e){
            System.out.println(e.getMessage());
        }catch(RepositorioException e){
            System.out.println(e.getMessage());
        }
        try{
            CadastraCliente.setClientes(new Cliente("Pedro", "321331223", "2312313442", "pedro@gmail.com"));    
        }catch(DadoInvalidoException e){
            System.out.println(e.getMessage());
        }catch(ClienteJaExistenteException e){
            System.out.println(e.getMessage());
        }catch(RepositorioException e){
            System.out.println(e.getMessage());
        }
        try{
            CadastraCliente.getCliente("321331223");
        }catch(ClienteInexistenteException e){
            System.out.println(e.getMessage());
        }
        try{
            CadastraCliente.setClientes(new Cliente("Joao", "54121873", "54874142", "joao@icloud.com"));    
        }catch(DadoInvalidoException e){
            System.out.println(e.getMessage());
        }catch(ClienteJaExistenteException e){
            System.out.println(e.getMessage());
        }catch(RepositorioException e){
            System.out.println(e.getMessage());
        }
        try{
            CadastraCliente.setClientes(new Cliente("Beatriz", "88454954", "2312313442", "beatriz@gmail.com"));    
        }catch(DadoInvalidoException e){
            System.out.println(e.getMessage());
        }catch(ClienteJaExistenteException e){
            System.out.println(e.getMessage());
        }catch(RepositorioException e){
            System.out.println(e.getMessage());
        }
        try{
            CadastraCliente.setClientes(new Cliente("Maria", "4634532", "4421412412", "maria@gmail.com"));    
        }catch(DadoInvalidoException e){
            System.out.println(e.getMessage());
        }catch(ClienteJaExistenteException e){
            System.out.println(e.getMessage());
        }catch(RepositorioException e){
            System.out.println(e.getMessage());
        }
        try{
            CadastraCliente.setClientes(new Cliente("Bruno", null, "47453645245", "bruno@hotmail.com"));    
        }catch(DadoInvalidoException e){
            System.out.println(e.getMessage());
        }catch(ClienteJaExistenteException e){
            System.out.println(e.getMessage());
        }catch(RepositorioException e){
            System.out.println(e.getMessage());
        }
        try{
            CadastraCliente.setClientes(new Cliente("Bruno", "9848421871", "47453645245", "bruno@hotmail.com"));    
        }catch(DadoInvalidoException e){
            System.out.println(e.getMessage());
        }catch(ClienteJaExistenteException e){
            System.out.println(e.getMessage());
        }catch(RepositorioException e){
            System.out.println(e.getMessage());
        }
        try{
            CadastraCliente.setClientes(new Cliente("Carol", "842184781", "4665632344", "carol@gmail.com"));    
        }catch(DadoInvalidoException e){
            System.out.println(e.getMessage());
        }catch(ClienteJaExistenteException e){
            System.out.println(e.getMessage());
        }catch(RepositorioException e){
            System.out.println(e.getMessage());
        }
        try{
            CadastraCliente.setClientes(new Cliente("Thiago", "4242311", "455233455", "thiago@hotmail.com"));    
        }catch(DadoInvalidoException e){
            System.out.println(e.getMessage());
        }catch(ClienteJaExistenteException e){
            System.out.println(e.getMessage());
        }catch(RepositorioException e){
            System.out.println(e.getMessage());
        }
        try{
            CadastraCliente.setClientes(new Cliente("Lucas", "54334211", "567563634", "lucas@gmail.com"));    
        }catch(DadoInvalidoException e){
            System.out.println(e.getMessage());
        }catch(ClienteJaExistenteException e){
            System.out.println(e.getMessage());
        }catch(RepositorioException e){
            System.out.println(e.getMessage());
        }
        try{
            CadastraCliente.setClientes(new Cliente("Nicole", "6343522", "56434434", "nicole@hotmail.com"));    
        }catch(DadoInvalidoException e){
            System.out.println(e.getMessage());
        }catch(ClienteJaExistenteException e){
            System.out.println(e.getMessage());
        }catch(RepositorioException e){
            System.out.println(e.getMessage());
        }
        try{
            CadastraCliente.setClientes(new Cliente("Nícolas", "77754743", "56543543", "nicolas@gmail.com"));    
        }catch(DadoInvalidoException e){
            System.out.println(e.getMessage());
        }catch(ClienteJaExistenteException e){
            System.out.println(e.getMessage());
        }catch(RepositorioException e){
            System.out.println(e.getMessage());
        }
        try{
            CadastraCliente.setClientes(new Cliente("Sofia", "753421123", "567424364", "sofia@gmail.com"));    
        }catch(DadoInvalidoException e){
            System.out.println(e.getMessage());
        }catch(ClienteJaExistenteException e){
            System.out.println(e.getMessage());
        }catch(RepositorioException e){
            System.out.println(e.getMessage());
        }
        try{
            CadastraCliente.setClientes(new Cliente("Joana", "75118723", "54121243", "joana@gmail.com"));    
        }catch(DadoInvalidoException e){
            System.out.println(e.getMessage());
        }catch(ClienteJaExistenteException e){
            System.out.println(e.getMessage());
        }catch(RepositorioException e){
            System.out.println(e.getMessage());
        }
        try{
            CadastraCliente.getCliente("315781254");
        }catch(ClienteInexistenteException e){
            System.out.println(e.getMessage());
        }
    } 
}
