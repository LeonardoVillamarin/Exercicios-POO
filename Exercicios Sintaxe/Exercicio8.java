import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int n, numMatriz;
        int total = 0;
        System.out.println("Digite a ordem da matriz:");
        Scanner num = new Scanner(System.in);
        n = num.nextInt();
        int[] soma = new int[((n*2)+2)];
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println("Digite número da matriz:");
                Scanner num2 = new Scanner(System.in);
                numMatriz = num2.nextInt();
                matriz[i][j] = numMatriz;
                if(i == n-1 && j == n-1)
                    num2.close();
            }
        }

        int x = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                soma[x] += matriz[i][j];
            }
            if (x < (n*2)+1)
            x++;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                soma[x] += matriz[j][i];
            }
            if (x < (n*2)+1)
            x++;
        }
        for(int i = 0; i < n; i++)
            soma[(n*2)] +=  matriz[i][i];
        for(int i = n-1; i >= 0; i--)
            soma[(n*2)+1] +=  matriz[i][i];    

        for(int i = 0; i < (2*n)+2; i++)
            total += soma[i];

        if (total/(n*2+2) == soma[0])
            System.out.println("É um quadrado mágico.");
        else
            System.out.println("Não é um quadrado mágico.");
        num.close();
    }
}

