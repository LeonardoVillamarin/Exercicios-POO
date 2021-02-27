package ExerciciosIntroducaoPOO.Exercicio6;

public class Baralho {
    int aux = 0;
    Cartas[] cartas = new Cartas[52];
    void imprimeBaralho(Baralho baralho){
        for(int i = 0; i < 53; i++)
        System.out.println(cartas[i].valor + " " + cartas[i].naipe);
    }
    cartas[aux] = new Cartas();
    cartas[aux].valor = "Ás";
    cartas[aux].naipe = "Copas";
    aux++;
    for(int i = 1 ; i < 13; i++){
        if(i == 1){
            cartas[i] = new Cartas();
            cartas[i].valor = "Ás";
            cartas[i].naipe = "Copas";
        }
        else if(i > 1 && i < 10){
        cartas[i] = new Cartas();
        cartas[i].valor = Integer.toString(i);
        cartas[i].naipe = "Copas";
        }
        else if()
    }
    cartas[aux] = new Cartas();
    cartas[aux].valor = "Valete";
    cartas[aux].naipe = "Copas";
    aux++;
    cartas[aux] = new Cartas();
    cartas[aux].valor = "Dama";
    cartas[aux].naipe = "Copas";
    aux++;
    cartas[aux] = new Cartas();
    cartas[aux].valor = "Rei";
    cartas[aux].naipe = "Copas";
    aux++;
    cartas[aux] = new Cartas();
    cartas[aux].valor = "Ás";
    cartas[aux].naipe = "Copas";
    aux++;

    for(aux ; aux < 10; aux++){
        cartas[aux] = new Cartas();
        cartas[aux].valor = Integer.toString(aux+1);
        cartas[aux].naipe = "Espadas";
    }
    cartas[aux] = new Cartas();
    cartas[aux].valor = "Valete";
    cartas[aux].naipe = "Espadas";
    aux++;
    cartas[aux] = new Cartas();
    cartas[aux].valor = "Dama";
    cartas[aux].naipe = "Espadas";
    aux++;
    cartas[aux] = new Cartas();
    cartas[aux].valor = "Rei";
    cartas[aux].naipe = "Espadas";
    aux++;

    cartas[aux] = new Cartas();
    cartas[aux].valor = "Ás";
    cartas[aux].naipe = "Ouros";
    aux++;
    for(aux ; aux < 10; aux++){
        cartas[aux] = new Cartas();
        cartas[aux].valor = Integer.toString(aux+1);
        cartas[aux].naipe = "Ouros";
    }
    cartas[aux] = new Cartas();
    cartas[aux].valor = "Valete";
    cartas[aux].naipe = "Ouros";
    aux++;
    cartas[aux] = new Cartas();
    cartas[aux].valor = "Dama";
    cartas[aux].naipe = "Ouros";
    aux++;
    cartas[aux] = new Cartas();
    cartas[aux].valor = "Rei";
    cartas[aux].naipe = "Ouros";
    aux++;
    cartas[aux] = new Cartas();
    cartas[aux].valor = "Ás";
    cartas[aux].naipe = "Paus";
    aux++;
    for(aux ; aux < 10; aux++){
        cartas[aux] = new Cartas();
        cartas[aux].valor = Integer.toString(aux+1);
        cartas[aux].naipe = "Paus";
    }
    cartas[aux] = new Cartas();
    cartas[aux].valor = "Valete";
    cartas[aux].naipe = "Paus";
    aux++;
    cartas[aux] = new Cartas();
    cartas[aux].valor = "Dama";
    cartas[aux].naipe = "Paus";
    aux++;
    cartas[aux] = new Cartas();
    cartas[aux].valor = "Rei";
    cartas[aux].naipe = "Paus";
    aux++;
}
