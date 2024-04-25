import java.util.Scanner;


public class ContaTerminal {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem vindo ao nosso banco!");
        System.out.println("Preencha os dados solicitados");
        System.out.println("Seu nome: ");
        String nome = scanner.nextLine();
        //Receber o código da agência
        System.out.println("Sua agencia: ");

        int agencia = scanner.nextInt();
        //Receber o número da conta bancária
        System.out.println("Digite o número da sua conta");
        int numeroConta = scanner.nextInt();
        //Receber o valor do saldo
        System.out.println("Seu saldo (R$): ");

        double saldo = scanner.nextDouble();
        //Fechar o objeto scanner.
        scanner.close();
        //Imprimir as declarações
        System.out.printf("Olá  %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo é %.2f já está disponível para saque", nome, agencia, numeroConta, saldo);


    }

}