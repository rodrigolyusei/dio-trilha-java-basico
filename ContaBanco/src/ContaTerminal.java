import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        // Configura o scanner para aceitar ponto como separador decimal
        Locale.setDefault(Locale.US);

        // Cria um scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Usar o nextInt retorna o Enter para o proximo next, o que pula a agencia
        //Para evitar isso, usamos o nextLine e convetemos para inteiro depois
        System.out.print("Por favor, digite o número da Agência:\t");
        int numeroAgencia = Integer.parseInt(scanner.nextLine());

        System.out.print("Agora me informe a sua Agência:\t\t");
        String agencia = scanner.nextLine();

        System.out.print("Digite o seu nome completo:\t\t");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("E por fim, digite o seu saldo:\t\t");
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque");

        // Fecha o scanner
        scanner.close();
    }
}