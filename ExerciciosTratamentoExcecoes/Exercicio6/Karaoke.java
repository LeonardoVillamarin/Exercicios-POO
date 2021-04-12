package ExerciciosTratamentoExcecoes.Exercicio6;

import java.util.*;

public class Karaoke {
    static boolean statusFuncionamento = true;
    static HashMap<String, String> musicas = new HashMap<>();
    static PriorityQueue<String> fila = new PriorityQueue<>();

    public static void escolheMusica(String info){
        if(musicas.get(info) != null){
            fila.add(info);
        }
        else{
            System.out.println("Músicas desse artista:");
            for(String str : musicas.keySet()){
                if(musicas.get(str).equals(info)){
                    System.out.println(str);
                }
            }
        }
    }
    public static void tocaMusica(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(statusFuncionamento){
                    try{
                        Thread.sleep(2000);
                    }catch(InterruptedException e){
                        System.out.println("A música foi interrompida");
                    }
                    if(fila.peek() != null){
                        String musica = fila.poll();
                        System.out.println("Tocando música: " + musica);
                        try{
                            Thread.sleep(30000);
                        }catch(InterruptedException e){
                            System.out.println("A música foi interrompida");
                        }
                        System.out.println("Música " + musica + " acabou");
                        if(fila.peek() != null){
                            System.out.println("Próxima música: " + fila.peek());
                            try{
                                Thread.sleep(2000);
                            }catch(InterruptedException e){
                                System.out.println("A música foi interrompida");
                            }
                        }
                        else{
                            System.out.println("Fila vazia, aguardando próxima música");
                        }
                    }
                }
            }
    }).start();     
    }
    public static void main(String[] args) {
        Karaoke.tocaMusica();
        musicas.put("Summer", "Calvin Harris");
        musicas.put("Blame", "Calvin Harris");
        musicas.put("Time of our lives", "Pitbull");
        musicas.put("One more light", "Linkin Park");
        musicas.put("The nights", "Avicii");
        musicas.put("My way", "Calvin Harris");
        musicas.put("In the end", "Linkin Park");
        musicas.put("Flags", "Coldplay");
        musicas.put("Paradise", "Coldplay");
        musicas.put("Numb", "Linkin Park");
        Scanner in = new Scanner(System.in);
        int opcao = 0;
        do{
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("O que deseja fazer?");
            System.out.println("1. Escolher uma música");
            System.out.println("2. Listar músicas");
            System.out.println("0. Sair do Karaokê");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            opcao = Integer.parseInt(in.nextLine());
            if(opcao == 1){
                System.out.println("Digite o nome da música ou do Artista");
                Karaoke.escolheMusica(in.nextLine());
            }
            else if(opcao == 2){
                for(String musica : musicas.keySet()){
                    System.out.println(musica + " - " + musicas.get(musica));
                }
            }
        }while(opcao != 0);
        Karaoke.statusFuncionamento = false;
        in.close();
    }
}
