package ExerciciosClassesAbstratasInterfacesArquivos.Exercicio3;

public class Escola extends Edificio{
    public Escola(boolean energiaRenovavel, int qtdLamp, int qtdArCondicionado){
        super(energiaRenovavel, qtdLamp, qtdArCondicionado);
    }
    public Escola(boolean energiaRenovavel, int qtdLamp, int qtdArCondicionado, String combustivelAquecimento){
        super(energiaRenovavel, qtdLamp, qtdArCondicionado, combustivelAquecimento);
    }
    @Override
    public void getDados() {
        if(combustivelAquecimento != null){
            System.out.printf("Energia Renovável? %b \nNúmero de Lâmpadas: %d\nNúmero de Ar Condicionado: %d\nCombustível de Aquecimento: %s\n", this.energiaRenovavel, this.qtdLamp, this.qtdArCondicionado, this.combustivelAquecimento);
        }
        else{
            System.out.printf("Energia Renovável? %b \nNúmero de Lâmpadas: %d\nNúmero de Ar Condicionado: %d\nCombustível de Aquecimento: Não Utiliza\n", this.energiaRenovavel, this.qtdLamp, this.qtdArCondicionado);
        }   
    }
    @Override
    public float getCarbonFootprint(){ //Retorna tonelada de CO2 por kWh
        if(!energiaRenovavel){
            if(qtdArCondicionado > 0){
                if(combustivelAquecimento != null){
                    if(combustivelAquecimento.equals("Gás Natural")){
                        return (float)(15*0.000066*qtdLamp + 1500*0.000066*qtdArCondicionado + 0.0002); 
                    }
                    else if(combustivelAquecimento.equals("Óleo de Aquecimento")){
                        return (float)(15*0.000066*qtdLamp + 1500*0.000066*qtdArCondicionado + 0.0002); 
                    }
                    else if(combustivelAquecimento.equals("Carvão")){
                        return (float)(15*0.000066*qtdLamp + 1500*0.000066*qtdArCondicionado + 0.0003); 
                    }
                    else if(combustivelAquecimento.equals("GLP")){
                        return (float)(15*0.000066*qtdLamp + 1500*0.000066*qtdArCondicionado + 0.0002); 
                    }
                    else if(combustivelAquecimento.equals("Propano")){
                        return (float)(15*0.000066*qtdLamp + 1500*0.000066*qtdArCondicionado + 0.00015); 
                    }         
                }
                else{
                    return (float)(15*0.000066*qtdLamp + 1500*0.000066*qtdArCondicionado);
                } 
            }
            else{
                if(combustivelAquecimento != null){
                    if(combustivelAquecimento.equals("Gás Natural")){
                        return (float)(15*0.000066*qtdLamp + 0.0002); 
                    }
                    else if(combustivelAquecimento.equals("Óleo de Aquecimento")){
                        return (float)(15*0.000066*qtdLamp + 0.0002); 
                    }
                    else if(combustivelAquecimento.equals("Carvão")){
                        return (float)(15*0.000066*qtdLamp + 0.0003); 
                    }
                    else if(combustivelAquecimento.equals("GLP")){
                        return (float)(15*0.000066*qtdLamp + 0.0002); 
                    }
                    else if(combustivelAquecimento.equals("Propano")){
                        return (float)(15*0.000066*qtdLamp + 0.00015); 
                    } 
                }
            }
        }
        else{
            if(combustivelAquecimento != null){
                if(combustivelAquecimento.equals("Gás Natural")){
                    return (float)0.0002; 
                }
                else if(combustivelAquecimento.equals("Óleo de Aquecimento")){
                    return (float)0.0002; 
                }
                else if(combustivelAquecimento.equals("Carvão")){
                    return (float)0.0003; 
                }
                else if(combustivelAquecimento.equals("GLP")){
                    return (float)0.0002; 
                }
                else if(combustivelAquecimento.equals("Propano")){
                    return (float)0.00015; 
                }
            }
        }
        return 0;
    }
}
