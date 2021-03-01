package ExerciciosIntroducaoPOO.Exercicio6;

public class Baralho {
    Carta[] cartas = new Carta[52];
    
    void criaBaralho(Baralho baralho){ 
        for(int i = 0 ; i < 13; i++){
            if(i == 0){
                cartas[i] = new Carta();
                cartas[i].valor = "Ás";
            }
            if(i > 0 && i < 10){
                cartas[i] = new Carta();
                cartas[i].valor = Integer.toString((i+1));
            }
            if(i == 10){
                cartas[i] = new Carta();
                cartas[i].valor = "Valete";
            }
            if(i == 11){
                cartas[i] = new Carta();
                cartas[i].valor = "Dama";
            }
            if(i == 12){
                cartas[i] = new Carta();
                cartas[i].valor = "Rei";
            }
            cartas[i].naipe = "Copas";
        }

        for(int i = 13 ; i < 26; i++){
            if(i == 13){
                cartas[i] = new Carta();
                cartas[i].valor = "Ás";
            }
            if(i > 13 && i < 23){
                cartas[i] = new Carta();
                cartas[i].valor = Integer.toString((i % 13 + 1));
            }
            if(i == 23){
                cartas[i] = new Carta();
                cartas[i].valor = "Valete";
            }
            if(i == 24){
                cartas[i] = new Carta();
                cartas[i].valor = "Dama";
            }
            if(i == 25){
                cartas[i] = new Carta();
                cartas[i].valor = "Rei";
            }
            cartas[i].naipe = "Espadas";
        }

        for(int i = 26 ; i < 39; i++){
            if(i == 26){
                cartas[i] = new Carta();
                cartas[i].valor = "Ás";
            }
            if(i > 26 && i < 36){
                cartas[i] = new Carta();
                cartas[i].valor = Integer.toString((i % 13 + 1));
            }
            if(i == 36){
                cartas[i] = new Carta();
                cartas[i].valor = "Valete";
            }
            if(i == 37){
                cartas[i] = new Carta();
                cartas[i].valor = "Dama";
            }
            if(i == 38){
                cartas[i] = new Carta();
                cartas[i].valor = "Rei";
            }
            cartas[i].naipe = "Ouros";
        }

        for(int i = 39 ; i < 52; i++){
            if(i == 39){
                cartas[i] = new Carta();
                cartas[i].valor = "Ás";
            }
            if(i > 39 && i < 49){
                cartas[i] = new Carta();
                cartas[i].valor = Integer.toString((i % 13 + 1));
            }
            if(i == 49){
                cartas[i] = new Carta();
                cartas[i].valor = "Valete";
            }
            if(i == 50){
                cartas[i] = new Carta();
                cartas[i].valor = "Dama";
            }
            if(i == 51){
                cartas[i] = new Carta();
                cartas[i].valor = "Rei";
            }
            cartas[i].naipe = "Paus";
        }
    }
    void imprimeBaralho(Baralho baralho){
        for(int i = 0; i < 52; i++){
            System.out.println(cartas[i].valor + " " + cartas[i].naipe);
        }
    }
}

