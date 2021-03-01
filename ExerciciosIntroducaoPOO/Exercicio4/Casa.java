package ExerciciosIntroducaoPOO.Exercicio4;

public class Casa {
    String cor;
    Porta porta = new Porta();
    Porta porta2 = new Porta();
    Porta porta3 = new Porta();
    int quantasPortasEstaoAbertas(Porta porta, Porta porta2, Porta porta3){
        if(porta.aberta && porta2.aberta && porta3.aberta)
            return 3;
        else if(porta.aberta && porta2.aberta && !porta3.aberta)
            return 2;
        else if(!porta.aberta && porta2.aberta && porta3.aberta)
            return 2;
        else if(porta.aberta && !porta2.aberta && porta3.aberta)
            return 2;
        else if(porta.aberta && !porta2.aberta && !porta3.aberta)
            return 1;
        else if(!porta.aberta && porta2.aberta && !porta3.aberta)
            return 1;
        else if(!porta.aberta && !porta2.aberta && porta3.aberta)
            return 1;
        return 0;
    }
}
