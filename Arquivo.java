import java.util.Scanner;

public class Arquivo {

    public static void main(String[] args) {
        int[] quant = new int[20];
        Scanner s = new Scanner(System.in);
        int soma = 0;

        // Ler os valores e calcular a soma
        for (int i = 0; i < quant.length; i++) {
            System.out.println("Informe o valor:");
            quant[i] = s.nextInt();
            soma += quant[i];
            System.out.println();
        }

        // Calcular a média
        double media = (double) soma / quant.length;

        // Exibir os valores em forma de tabela
        System.out.println("Valores informados:");
        for (int i = 0; i < quant.length; i++) {
            System.out.print(quant[i] + "\t");
        }
        System.out.println(); // Adicionando uma quebra de linha após cada linha da matriz
    
        // Determinar o menor valor
        int menorValor = quant[0]; // Assume o primeiro valor como o menor inicialmente
        for (int i = 1; i < quant.length; i++) {
            if (quant[i] < menorValor) {
                menorValor = quant[i];
            }
        }
        
        System.out.println("O menor valor informado é: " + menorValor);
        
        // Determinar quantos valores são maiores que a média
        int countMaiorQueMedia = 0;
        for (int i = 0; i < quant.length; i++) {
            if (quant[i] > media) {
                countMaiorQueMedia++;
            }
        }

        // Exibir o resultado
        System.out.println("A média dos valores é: " + media);
        System.out.println("Quantidade de valores maiores que a média: " + countMaiorQueMedia);

        s.close(); // Fechando o Scanner para evitar vazamentos de recursos
    }
}
