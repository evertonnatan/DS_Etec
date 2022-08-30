import java.util.Scanner;

public class SomaValores {
    public static void main (String args[]) {
        /* O código desenvolvido por você deverá estar aqui. As chaves marcam o início do código. 
        Diferente do pseudocódigo, as variáveis em java podem ser declaradas diretamente no corpo do programa, 
        mas a recomendação continua: devemos declarar as avariáveis logo no início do código fonte.
        */

        // Declaração das variáveis:
        int numero1;
        int numero2;
        int soma;
        // Para facilitar o entendimento, também habilitamos o leitor no início do código
        Scanner leitor = new Scanner(System.in);

        // Início do programa:
        System.out.println("Programa Soma - Este programa calculará a soma entre dois números");
        System.out.println("Digite o PRIMEIRO valor: ");
        
        // Leitura do primeiro valor:
        numero1 = leitor.nextInt();
        System.out.println("Digite o SEGUNDO valor: ");

        // Leitura do segundo valor:
        numero2 = leitor.nextInt();

        // Processamento:
        soma = numero1 + numero2;

        // Saída de dados:
        System.out.println("O resultado da soma eh " + soma);
        
    }
}