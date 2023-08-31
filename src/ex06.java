import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();
        
        int maiorValor = Math.max(valor1, valor2);
        
        System.out.println("O maior valor é: " + maiorValor);
    }
    
}
/*Esse programa irá ler dois valores, compará-los e imprimir o maior deles. */