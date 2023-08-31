import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número da conta do cliente: ");
        int numeroConta = scanner.nextInt();
        
        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
        
        System.out.print("Digite o débito da conta: ");
        double debito = scanner.nextDouble();
        
        System.out.print("Digite o crédito da conta: ");
        double credito = scanner.nextDouble();
        
        double saldoAtual = saldo - debito + credito;
        
        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
        
        System.out.println("O saldo atual da conta é: R$" + saldoAtual);
    }
    
}
/*Esse programa irá ler o número da conta do cliente, o saldo, o débito e o crédito. Em seguida, ele calculará o saldo atual da conta subtraindo o débito e adicionando o crédito ao saldo. Depois disso, ele verificará se o saldo atual é maior ou igual a zero e imprimirá a mensagem "Saldo Positivo" ou "Saldo Negativo" de acordo com esse resultado. Por fim, ele imprimirá o valor do saldo atual. */
