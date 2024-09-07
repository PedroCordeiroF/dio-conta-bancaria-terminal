package prj.pedro.conta;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Digite o numero da sua conta: ");
      int numeroConta = scanner.nextInt();

      System.out.println("Digite o número da sua agência: ");
      String agencia = scanner.next();

      System.out.println("Digite o seu nome completo: ");
      String nomeCompleto = scanner.next();

      System.out.println("Digite o valor a ser depositado como saldo: ");
      double saldo = scanner.nextDouble();

      System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é "
            + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");
   }
}
