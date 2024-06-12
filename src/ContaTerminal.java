import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua conta Ex: 1021 -> ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, sua agência Ex: 067-8 -> ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome Ex: MARIO ANDRADE -> ");
        String nomeCliente = scanner.nextLine();

        Double saldo = null;
        while (saldo == null) {
            System.out.println("Por favor, digite o saldo inicial Ex: 237.48 -> ");
            String saldoStr = scanner.nextLine();
            try {
                saldo = Double.parseDouble(saldoStr);
            } catch (NumberFormatException e) {
                System.out.println("Formato de saldo inválido. Por favor, insira novamente.");
            }
        }

        usuario.imprimir(numero, agencia, nomeCliente, saldo);

        scanner.close();
    }
}
