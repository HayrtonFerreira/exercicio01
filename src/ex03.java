import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de maçãs compradas: ");
        int quantidade = scanner.nextInt();
        
        double custoTotal;
        
        if (quantidade < 12) {
            custoTotal = quantidade * 1.30;
        } else {
            custoTotal = quantidade * 1.00;
        }
        
        System.out.println("O custo total da compra é: R$" + custoTotal);
    }
}
/*Esse programa irá ler o número de maçãs compradas e calcular o custo total da compra, considerando o valor de R$ 1,30 para   menos de uma dúzia e R$ 1,00 para pelo menos uma dúzia.
 */
