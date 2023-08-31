import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();
        
        if (valor1 < valor2) {
            System.out.println("Em ordem crescente: " + valor1 + ", " + valor2);
        } else {
            System.out.println("Em ordem crescente: " + valor2 + ", " + valor1);
        }
    }

}
/*Esse programa irá ler dois valores, compará-los e imprimir os valores em ordem crescente. */