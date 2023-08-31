import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();
        
        System.out.print("Digite o valor das vendas efetuadas pelo vendedor: ");
        double valorVendas = scanner.nextDouble();
        
        double comissao;
        
        if (valorVendas <= 1500) {
            comissao = valorVendas * 0.03;
        } else {
            comissao = (1500 * 0.03) + ((valorVendas - 1500) * 0.05);
        }
        
        double salarioTotal = salarioFixo + comissao;
        
        System.out.println("O salário total do vendedor é: R$" + salarioTotal);
    }
    
}
/*Esse programa irá ler o salário fixo do vendedor e o valor das vendas efetuadas. Em seguida, ele calculará a comissão do vendedor, levando em consideração que ele recebe 3% sobre o total das vendas até R$ 1.500,00 e 5% sobre o que ultrapassar esse valor. Por fim, ele calculará o salário total do vendedor somando o salário fixo com a comissão. */
