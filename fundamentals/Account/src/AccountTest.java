//import Account.java;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // cria um objeto Scanner para obter entrada a partir da janela de comando
        Account myAccount = new Account(); // cria um objeto Account e o atribui a myAccout
        System.out.printf("Initial name is: %s%n%n", myAccount.getName()); // exibe o valor inicial do nome (null)
        System.out.printf("Please enter the name: "); // solicita e lê o nome
        String theName = input.nextLine(); // lê uma linha de texto
        myAccount.setName(theName); // insere theName em myAccount
        System.out.println(); // gera saída de uma linha em branco
        System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());
    }
}

