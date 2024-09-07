package prj.pedro.conta;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
   public static void main(String[] args) {
      // Criando o objeto scanner
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Digite seu nome completo: ");
      String nomeCompleto = scanner.nextLine();

      System.out.println("Digite o número da sua conta: ");
      int numeroConta = scanner.nextInt();

      System.out.println("Digite o número da sua agência: ");
      String agencia = scanner.next();

      System.out.println("Digite o valor que você deseja depositar como saldo: ");
      Double saldo = scanner.nextDouble();

      System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é "
            + agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque");

   }
}
